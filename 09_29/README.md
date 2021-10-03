09_29
----
# 용어 정리
    AS IS-TO BO
    POJO
    FQCN

# 형상관리

## 형상관리란?
형상관리란 Software Configuration Managemen를 줄여 SCM이라고 많이 부른다. SW개발 및 유지 보수하는 과정 중 소스 문서 인터페이스 등 다양한 데이터들을 체계적으로 관리하고 제어하기 위한 활동을 말한 시스템. 더불어 다수의 개발자가 프로젝트에서 동일한 기능을 동시에 개발할 때 변경 사항을 확인하고 수정을 할 수 있게 도와주는 협업 시스템

## Git
다양한 형상관리 툴이 있지만 여러 사람들과 하나의 **프로젝트를 함께 관리하여 협업에 최적화 된 툴**?  
모든 작이 로컬에서 이루어 지고 네트워크 사용은 원격 저장할때만 한번 이루어지므로 **개발 시 처리 속도가 빠르다**. 더불어 **웹 상에 저장소**를 둘수 있기 때문에 언제 어디서나 협업이 가능하다. 중앙 저장소가 에러 빌생해도 **로컬에서 복구**가 용이하고 히스토리 관리가 잘 제공되어 있어 **관리가 용이**하다. 

### Git 용어 정리
- branch  
    가지..??? 음 설명이 애매함 ...
- Repository  
    저장소
- Commit  
    local작업 하고 있는 프로젝트를 현재 있는 branch에 저장
- Checkout  
    다른 branch로 이동
- Merge  
    다른 branch에 있는 것을 가져온다? 병합? 
- Conflict   
    동기화 문제시 충돌 문제
# FrameWork
Frame (틀, 규칙or 법칙) + work (일, 소프트웨어의 목적)   
특정 개념 (control) 같은 것을 재 사용한 lib??
## Spring

스프링프레임워크란 엔터프라이즈급 애플리케이션 개발에 필요로하는 **경량형 프레임워크**.  
 프로젝트의 규모가 커질수록 스트럿츠 보다는 스프링 프로젝트가 많이 활용이 되고 있는 추세다  
J2EE에서 제공하는 대부분의 기능을 지원하기 때문에 JAVA개발에 있어서 대표적인 프레임워크로 자리잡고 있으며 JDBC를 비롯하여 iBatis, 하이버네이트, JPA등 DB처리를 위해 널리 사용되는 라이브러리와 연동을 지원하고 있다. 또한 전자정부 표준프레임워크의 기반이 되는 기술이기 때문에 스프링 프레임워크의 활용도는 더욱 높아지고 있다.

## Spring의 제공 
<img src ="./lesson/sp01/part03/spring-overview.gif">

모든 것들은 core에서 진행되며, 개발자들이 많이 사용하는 기본적인 뼈대(틀)을 제공 해준다.

## 들어가기 전 코딩에 대한 차이를 보자.
### 하드코딩에 대해 
```java
//bean
public class Hello{
	
	///Field
	private String message = "Container 란 무었인가.";
	
	///Constructor Method
	public Hello() {
	}
	public Hello(String message) {
		this.message = message;
	}

	///Method
	//==> getter / setter Method definition
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	//==> message 를 출력하는 Method  
	public void printMessage() {
		System.out.println("\n"+getClass().getName()+"=>"+message);
	}
	
}
```

```java 
public class HelloTestApp01 {
	
	///main method
	public static void main(String[] args) {
		//==>1. instance 생성 
		Hello hello = new Hello();
		//==> 2. printMessage() method 호출
		hello.printMessage();
	}
}
```


이렇게 되있다고 가정해보자.  
만약 내가 다른 bean을 사용하기 위해선 결국 코드를 수정 해야한다.  
이게 코드의 양이 많아지고 복잡한 관계를 갖게 되었다면 ?  
하나만 해당 bean을 수정 해야 하는 큰 작업이 이루어진다.

----

### 유동적인 코딩
metaData를 활용한다면 코드에서 수정이 일어나는 것이 아닌 외부 파일에서 수정이 이루어지면 된다.
```properties
# hello.properties
instance.one=spring.service.hello.Hello
```
```java 
public class HelloTestApp02 {
	///main method
	public static void main(String[] args) {
		// 1. 사용할 Bean  정보를 갖는  hello.properties(meta-data)를
		//      parsing, Bean instance를 생성할 HelloFactory  instance 생성
		HelloFactory helloFactory =	HelloFactory.getInstance();
		// 2.  helloFactory instance 로 parsing 할 resource::meta-data(hello.properties) 전달   
		helloFactory.setConfigResource("./src/main/resources/config/hello.properties");
		// 3. helloFactory instance 로 부터 instance.one 이름을 갖는 Hello instance Request  
		Hello hello = helloFactory.getBean("instance.one");
		// 4.  printMessage() 호출  
		hello.printMessage();
	}
}
```
```java 
public class HelloFactory {
	///Field
	private Hello hello;
	private Properties properties;
	private static HelloFactory helloFactory;
	
	///Constructor Method
	private HelloFactory(){
	}
	
	///Method
	//==> HelloFactory instance 를  return 하는 static method
	public synchronized static  HelloFactory getInstance() {
		if( helloFactory == null){
			helloFactory = new HelloFactory();
		}
		return helloFactory;
	}
	
	//==> properties file 을 추상화,캡슐화한  java.util.Properties instance 생성 
	public void setConfigResource(String configResource) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(configResource);
			properties = new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("1. hello.proerties 파일을 찾을수 없음.");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("2. hello.proerties 파일 초기화 시 오류 발생.");
		}finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();	
				}
			}
		}
	}	

  	//==> Meta-Data 에 기술된 name 에 해당하는 instance 생성  
	private void newInstanceHello(String name){
		
		String className = properties.getProperty(name).trim();  //==> trim() 앞뒤 공백 trim
		System.out.println("!! debug=>hello.properties 에서 추출한 className : "+className);

		try {
			Class  cls = Class.forName(className);
			Object obj = cls.newInstance();
			//==> Hello Instance 확인
			if( obj instanceof Hello){
				this.hello = (Hello)obj;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("1. "+className +"의 이름을 갖는 class가 없음.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("2. "+className +"의 instance 생성시 문제 발생.");
		}
	}
	
  	//==> newInstanceHello() 호출 Meta-Data 에 기술된 name 에 해당하는 instance return
	public Hello getBean(String name){
		this.newInstanceHello(name);
		return hello;
	}
	
}
```
----

## Spring Frame Work의 API를 사용한 예시
```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans 	xmlns="http://www.springframework.org/schema/beans"
				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xsi:schemaLocation="http://www.springframework.org/schema/beans
													  http://www.springframework.org/schema/beans/spring-beans.xsd">												 
												 
     <!-- ㅇ Hello instance 생성 서술적, 선언적 기술
			ㅇ bean element 및 attribute 
				- id : instance identifier 
				- class : instance 생성 Bean (FQCN)     -->
				
		<bean id="hello" class="spring.service.hello.Hello"/>

</beans>
```

```java
public class HelloTestApp03UseSpring {

	/// main method
	public static void main(String[] args) {
		
		//1. BeanFactory 을 이용 xml 에 선언적으로 기술된 instance 정보 획득
		BeanFactory factory =
				new XmlBeanFactory( new FileSystemResource
																	("./src/main/resources/config/hello.xml") );

		//2. Container 로 부터 hello 의 name 을 갖는 instance return 받기  
		Hello hello = (Hello)factory.getBean("hello");
		hello.printMessage();
	}
	
}
```
### BeanFactory [API](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html)

meta data를 통해 bean에 접근 하기 위한 루트 인터페이스?

- getbean()  
파라미터의 값을 받아 meta data에 정보가 있으면 그에 맞는 인스턴스를 생성해서 반환 해준다.

- 더 많은 정보는 API참고ㅋ