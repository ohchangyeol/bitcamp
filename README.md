# 용어 정리

## System ( 시스템 )

 +  정보를 처리하는데 사용되는 프로그램 등, 절차 데이터 및 기기들의 다양한 집합체

## Modeling ( 모델링 )

- 모형 제작 => 기획  
시스템 구축시 구현전 결정하는 모든 활동.(요구사항 정의, 분석 , 설계 )

## UML 

- `Unified Modeling Language`로 표준화된 범용 모델링 언어.

## CSV ( 콤마 세퍼레이터드 밸류 )
- `comma separated values`
- 구분선  


## Compile ( ByteCode ) 

- `.java` 파일을 `.class` 파일로 변환 시켜주는 것.

## Variable ( 베리어블 )
- 변수

## Platform ( 플랫폼 )
 - 특정 장치나 시스템에서 이를 구성하는 기초가 되는 틀 또는 골격을 지칭하는 용어.  
 ex) 운영체제의 플랫폼은 PC. 아래한글의 플랫폼은 운영체제임.

## Identifier (아이덴티파이어)
- 식별자 or 고유의 이름.
- numbering을 하지않는다.
  
  ###  Camel Case ( 카멜 케이스 )
  > 첫번 째 단어는 소문자 두번재 단어부터는 대문자.  
  낙타 등처럼 생겼다 해서 붙혀진 이름
  ```java
  String userList;
  String newTodoList;
  ```
  주로 변수명, 메소드에 쓰인다.
  
  ### Pascal Case ( 파스칼 케이스 )
  > 단어마다 번번째는 대문자로 쓰는것
	```java
	public class TserList{}
	public class TodoList{}
	```
	보통 클래스명에 쓰임

  ### Snake Case ( 스네이크 케이스 )
  > 단어를 _ 로 나눔
	```java
	user_list , new_todo_lsit
	final int USER_LIST;
	```
	보통 파일명이나 상수에 주로 쓰인다.  
  
## JRE ( Java SE Runtime Environment )
- 자바를 돌아가는 환경.
- `java API`와 `VM (버츄얼 머신)`을 합친 것

## JDK ( Java Development Kit )
- 개발하기 위해 사용하는 도구.

## JVM ( Java Virtual Machine )
- 어느 운영체제 상에서도 실행될 수 있게 하는 것
- 프로그램 메모리를 관리하고 최적화하는 것

## src
- `source`의 줄임말  

## Runtime error ( 런타임 에러 )
- `Compile`에는 문제가 없으나 , `run` 했을 때 에러 발생

## API ( 어플리케이션 프로그래밍 인터페이스 )
- `Application programming Interface`
- 응용 프로그램에서 사용할수 있도록 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할수 있게 만든 인터페이스 

## literal ( 리터럴 )
- 그 자체로 값을 의미하는 것 =>  <u>`0`</u> 을 의미
    ```java
    int i = 0;
    ```
## path
- 사람은 자신이 만든 파일이 어디에 있는지 알 수 있으나 컴퓨터는 모르기 때문에 `경로`를 지정해 주는 것.

## class path 
- 설정하지않으면 `.` 으로 `default값`으로 지정  
- 해당하는 `class`가 해당 위치에 있는 `instance class`를 찾아간다.

## keyword
- 예약어  
  `boolean`, `class`, `for`, `if` 이런것을 의미

## casting 
- 형변환   
- ***08_11 수업정리***  
  
## operator ( 오퍼레이터 )
- 연산자??
- `.` , `new` 같은 것 ????
-  new 새로운 메모리 할당.

## debug
- 오류를 잡는 행위

## Readability ( 리더빌리티 ) 
- 들여쓰기
- 가독성

## return 
- 돌려받다 or 돌아가다.  
  돌려받을시엔 무조건 `value`만 돌려 받을 수 있다.

## refactoring ( 리팩토링 )
- 소스를 보안하는 행위.

## initialize (이니셜라이즈)
- 초기화

## field
- 멤버변수 or `전역변수`
- 상태,속성의 정보.

## class 변수, class 메소드
- static이 붙은 Variable, method는 `bean 실행`시 우선순위 1순위로 적재되고 class를 `Instance`를 하지않아도 `className으로 호출`이 가능.

## Instance 변수
- 멤버 변수 or 참조 변수 

## 지역변수 ( localVariable )
- `클래스영역 이외`의 영역
- `메서드`, 생성자, 초기화 블럭 내부
- 초기화가 되지않으면 사용할때 에러가 발생한다.

## beans
- `object modeling`한 class.
- real world 를 `class`로 표현한 것. 
- `main`이 없다. 

## Hard coding ( 하드코딩 )
- 조건에 값을 대입하는 것



## Sorting ( 소팅 )
- 정렬

## extends
- `Inheritance` 개념
- 확장, 공유, 상속
- 하나의 클래스엔 하나밖에 상속이 되지않는다.
  ```java
  public class ChildClass extends ParentClass {
	  ...
  }
  ```

## Information Hiding ( 인포메이션 하이딩 )  
- 정보은닉 - `캡슐화`와 관련성이 높다. 

## attribute ( 어트리뷰트 )
- 명사 - 데이터타입과 변수 선언을 말한다.
- Field (필드), State (상태)

## behavior ( 비헤이버 )
- 동사 - 기능,함수(function), 메서드(method)를 말한다.



## instance 생성 
- 하드디스크에 있는 class를 메모리에 할당 하는것.

## Method Syntax 
- 메서드 명령어
- **좀더 공부해야 함**

## message 
- 객체와 객체가 커뮤니케이션 하기 위해 생긴 것
- `인자`, `Paramiter (매개 변수)`

## 인자 
- `method` 의 `()안`의 보내는 쪽을 말한다. 
- - 호출할 때 쓰면 인수

## paramiter(매개변수) 
- method 의 ()안의 받는쪽 
- method 만들때 넣는 것이 매개변수

## Constructor ( 컨스트럭스 ) - 생성자
- bean을 생성시 `default` 값으로 있다.
- `instance 변수`의 인자를 받아 `Constructor`의 `Overloading`으로  인해 다양한 상태, 정보 등 멤버 변수를 초기화 시켜 다양한 참조형 데이터를 생성 할 수 있다.
- `return`을 명시하지 않는다.
- -`Initializr` 하는 method

## getter method, setter method
- 객체 지향의 특성 중 `정보 은닉(캡슐화)`을 가장 잘 보여주는 메서드.
- getter, setter를 통해 멤버 변수의 값을 변경, 호출을 할수 있다.
- 무조건 get,set을 써야하는 것은 아니지만 개발자들 사이에서 `암묵적인 룰` 같은 개념 이다.

## overloading 
- 하나의 공통 된 `Behavior (행동)` or `method`를 다른 인자값 또는 개수를 주어 다른 결과값을 출력 하는 것. 

## validation ( 벨리데이션 )
  -유효성 검사.


## super와 this
> Constructor와 연관
- ### this
  
  ---
	현재 클래스의 인스턴스를 의미한다.  
	즉, 현재 클래스의 `Field`나 `method`를 지정할 때 사용합니다.  
	this가 지정하는 `Field`나 `method`를  현재 클래스 안에 없으면 `상속` 되어있는 곳까지 찾아가서 찾아본다 => **확인 필요**
	```java
	public class Example{
		String str;
		
		public Example (){
			this.str = "예시";	
		}
	} // 결과 값 : str = 예시 
	```

- ### this() 

	---
	현재 클래스의 Constructor를 호출한다.  
	**자기 자신을 호출할 순 없다**, constructor이 recursive 때문에 재귀하기 때문에 에러가 발생한다.
	```java
	public class Example{
		String str;
		int i;
		public Example (String str){ // str = "예시"
			this.str = str;	
		}
		public Example (int i){ 
			this.i = i;	
		}
		public Example (String str, int i){//  str = "예시" i = 1
			this(str);
			this(i);
		}
	} // 결과 값 : str = 예시 , int = 1 ;
	```



- ### super

	---

	자식 클래스에서 사용이 가능하고, 상속 받은 부모 클래스의 Field를 참조할 때 쓴다.
	```java
	public class Parents{
		String str;
	}
	
	public class Example extends Parents{
		String str;
		public Example (){
			super.str = "예시";	
		}
	} //Example.str = null , Parents.str = 예시 
	```
- ### super()
	
	---

	부모 클래스의 Constructor를 명시적 호출한다.  
	아무것도 없을 때 super()값이 `default`  
	상속이 안되있을 경우 `error` 발생 
	```java
	public class Parents{
		String str;
		int i;
		public Parents (String str){
			this.str = str;	
		}
		public Parents (int i){
			this.i = i;	
		}
		public Parents (String str, int i){
			this(str);
			this(i);
		}
	}
	
	public class Example extends Parents{
		String str;
		int i;
		public Example (String str, int i){ //  str = "예시" i = 1
			super(str,i);
		}
	} 
	/*
		Example.str = null;
		Example.i = 0;

		Parents.str = 예시;
		Parents.i = 1;
	*/
	```

## overriding 
- 부모 클래스에 있는 method를 자식 클래스의 method로 동일하게 만드는 행위 
- 올라타다.
- method를 `upgrade`한다?

## commandLine argument 
- 명령행 매개변수 ( `CMD` )
  ```cmd
  java CalssName 여기 있는 것
  ```

## signature (시그니처)
- 선언 부분
  ```java 
  public final class String extends Object{
	//public final class String extends Object 까지가 시그니처
  }
  ```

## Polymerism ( 폴리머피즘 ) - 다형성
- 하나의 인터페이스에 다양하게 쓰이는 것.

## package
- java의 디렉토리.
  		
	```
	windows - 폴더(\) , Linux - 디렉토리(/), java - package(.)
	```

## Open Source ( 오픈소스 )
-공개적으로 액세스할 수 있게 설계되어 누구나 자유롭게 확인, 수정, 배포할 수 있는 코드.

## Access modifier ( 액세스 모더파이어 ) -접근 제어자
>맴버 또는 클래스에 사용되어 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한하는 역활.  `캡슐화의 중요성`

> private -> default -> protected -> public  



  - ### Private (프라이빗)
	
	---
	> `method` , `Field`

	`같은 클래스` 안에서만 접근이 가능하고 다른 클래스나 외부에서 접근을 제한한다.  



  - ### default (디폴트)
  
  	---
	>`class` , `Method` , `Field` 

  	`같은 클래스`, `같은 패키지`에서 접근이 가능하다.


  - ### protected (프러텍티드)

	---
	> `Method` , `Field`

  	`현재 클래스`,`같은 패키지`, `상속된 자손`까지 접근이 가능하다.



  - ### public (퍼블릭)
  	
	---
	>  `class` , `Method` , `Field`

	  `같은 클래스`, `같은 패키지`, `상속된 자손`, `전체`다 접근을 허용한다.
  
## recursive 
  - 재귀하다, 무한

## Modifirer ( 모디파이어 ) - 제어자 
> class, ,Field, Method의 선언부에 함께 사용되어 부가적인 의미를 부여한다.

  - ### static 
  
	---
	>`Fileld` , `Method`

	공통적인 의미를 가지고 있다.  
	**instance**를 선언하지 않아도 다른 클래스에서 **참조**,**호출** 할 수 있다.  
	클래스가 메모리에 로드될 때 우선순위.
	
	- static변수 - `클래스변수`
  
   		instance에 관계 없이 `같은 값`을 갖는다.  
		`클래스가 메모리에 로드될 때 생성`된다.  
		ex) 남자 고등학교의 학적 시스템 = **성별**


	- static메서드

   		instance를 생성하지 않아도 호출이 가능하다.  
   		static 메서드 내에서는 `인스턴스 멤버를 직접 사용할 수 없다`.

  - ### final 

	---
	>`class` , `Fileld` , `Method`
    
	**마지막의, 변경될 수 없는** 이라는 의미를 가지고 있다.

	- final class
 
   		> `변경될수 없는 클래스`이며 확장이 불가능한 클래스.  
		`상속이 불가능`하다.

	- final field 
		
		> 값을 변경할 수 없는 `상수`가 된다.
	
	- final Method 
  		
		> `Overriding`을 통해 `재정의 될 수 없다`.

  - ### abstract 
  	
	---
	>`class` , `Method`
	
	**미완성** 이라는 의미를 가지고 있고 method의 선언부만 작성하고 구현 하지않는 추상메서드를 선언하는데 사용한다.  
	Instance 생성 불가  
	**추상**, **형태만 잡아놓는 것** 


	- abstract class

		> 클래스 안에 `추상 메서드가 선언`되어 있음을 의미한다. 
	   
	- abstract Method

		> 선언부만 작성하고 구현은 작성하지 않는 `추상메서드`를 의미한다.
	   
	```java
	abstract class AbstractTest { 
		abstract void move(); 
		}

	```

## Instance Casting

  - ### 묵시적 형변환  

	---
	자손클래스에 있는 `추가된 기능`은 사용할 수 없다. 하지만 `overriding` 된것은 자신의 method를 재정의 했기 때문에 `사용이 가능`하다.
	
  - ### 명시적 형변환   

	---
	자손클래스의 추가된 기능을 다시 사용하게 하기 위해 명시적()으로 사용해 다시 사용할 수 있다.

	```java
	class Super{	
    ///method
		public void a (){
			System.out.println("SuperClass의 a()");
		}
	}
	class Sub extends Super{
		///Overriding
		public void a (){System.out.println("overriding 된 Sub = a()");}
		///Method
		public void b (){System.out.println("Sub = b()");}
	}
	public class CastingTest{
		//Main
		public static void main(String[] args) {
			Super superReference = new Sub(); //==> 묵시적 형변환.
			superReference.a(); //==> overriding되지 않은 method를 호출한다.
			//superReference.b(); // b()메소드를 찾을수 없다.
			Sub subReference = (Sub)superReference;//==> 명시적 형변환.
			subReference.a();
		}
	}
	```

## 분산 환경 

  - 네크워크를 통해 여러 os 가 모인 환경.
---
# 08_23 용어

## ASCII Code ( 아스키 코드 )
> 컴퓨터는 0과 1 밖에 모르기에 문자도 숫자로 기억해서 어떤 숫자와 문자를 대응시키기 위해 통상 아스키 코드 방식을 많이 사용한다.

## Encoding ( 인코딩 )
> 사용자가 입력한 문자나 기호들을 컴퓨터가 볼 수 있는 0과 1로 변환 하는 과정.  
> 그것을 통상 많이 쓰는 것이 `아스키 코드`?
## decoding ( 디코딩 )
> 디코딩은 인코딩의 반대로서 사람이 이해할 수 있도록 바꿔주는 것을 의미.  
> `Byte형식을 문자열로 변환`
## Diamond problem ( 다이아몬드 프라블럼 )
> 하늘 아래 두 부모를 두지않는다ㅋㅋ...다중 상속을 다이아몬드 프라블럼이라고 하는 것 같다.

  - Interface에는 다중 구현이 가능하지만, 클래스 상속은 하나의 클래스만 가능.
  ### 왜? 안될까?
  > 조상클래스가 만약 추상 클래스라면 문제가 발생.    
  예시를 보자

  ```java
  // Person Class
  public abstract class Person {
	  public abstract void speak();// overriding 
  }
  ```
  ```java
  // Father Class
  public abstract class Father extends Person {
	  public void speak(){
		  System.out.println("Father의 overriding");
	  }
  }
  ```
  ```java
  // Mother Class
  public abstract class Mother extends Person {
	  public void speak(){
		  System.out.println("Mother의 overriding");
	  }
  }
  ```
  ```java
  // Child Class
  public abstract class Child extends Father,Mother {
	  public void test(){
		  speak();
	  }
  }
  ```
  >조상클래스를 상속받는 아빠, 엄마 클래스가 있다 가정하자.  
  조상클래스에 오버라이딩을 해야 하는 경우라면 엄마 아빠는 당연하게 오버라이딩을 해야한다. 그럼 자식은 어떤 클래스의 메서드를 호출 해야할지 알 수 없기 때문이다.
  
## Interface
 > pure abstract class - 순수한 추상클래스
 - abstract를 생략 가능하다.
 - 상속, 공유가 불가.
 - 구현되지않는 것을 실체화 한다.
 - 특별한 클래스이다.
 - `추상된 기능을 빼놓는 것`.
 - 기능을 통일을 위한 인터페이스 사용
 - modeling시 기능의 정의를 해서 `재사용성`을 높힘
 - `여러개의 Interface`를 implements 할 수 있다.
 - 인터페이스 안에 있는 Field는 `Final Static` 이라는 키워드가 붙고,  
   모든 메서드에는 `abstract`가 붙는다.

 ### 왜 씀???
  > 해당 하는 기능을 다른 곳에 쓰기 위해 ( 재사용성 )  
  		
		  TV    - 볼륨
  		
		  라디오  - 볼륨
  		
		  스피커 - 볼륨
	
> 일반화 되지않는 것에 상속을 해 `abstract` 하는것보다 인터페이스를 이용해 볼륨 이라는 기능만 정의해 놓으면 어디서든 쓸수 있다.

## ~is a~ 관계
 > **`Generalization`**, **`Specialization`**, **`Realization`**  

	Generalization - 일반화 - exteds
	사람은 동물이다.

	Specialization - 구체화 - exteds
	직원은 사람이다.

	Realization - 기능을 구현 - implements
	KS는 나사다?????
  -  ~ 는 ~ 이다 (~is a~) 관계 형성	
  - `exteds`, `implements` 라는 keyword 존재.
 
## Association
 > **~has a~ 관계**

	Association - 포함관계
	나는 노트북을 가지고 있다.

 - ~는 ~를 가지고 있다 (~has a~)관계 형성

 ```java
 public class Changyeol{
	//Field
	Laptop laptop = new Laptop();// 갖고 다니는 관계.
 	//Method
	 public void testUse() {
		this.laptop.use(); 
 	}
 }
 ```
 ## dependency
 > 버리는 관계
 ```java
 public class Changyeol{
	//Field
	//Method
 	public void testUse() {
    	Laptop laptop = new Laptop();// 버리는 관계.
    	this.laptop.use(); 
 	}
 }
 ```

# 08_24 용어

## Garbage 
- 메모리에 떠있고 사용할수 없는 istance 를 말한다
## garbage collector 
- Java에서는 개발자가 프로그램 코드로 메모리를 명시적으로 해제하지 않기 때문에 더 이상 필요 없는 객체를 찾아 지우는 작업을 하는 애
## garbage collection 
- JVM의 가비지 컬렉터가 불필요한 메모리를 알아서 정리

## parsing (파싱)
 - 분석하거나 하나 하나 씩을 나누는 것을 말한다.
 
## 레퍼런스 카운터 
- 식별성의 개수
## Concrete Methods 
- api에서 Concrete Methods란 ? 
  >추상화(abstract 나 interface)된 메서드를 오버라이딩 한것.
## Deprecated 
- API에서 사용되지 않으니 다른것을 쓰기바람.
## Wrapper Class - 래퍼클래스
 > Java의 데이터 타입은 기본형 타입(primitive type)과 참조형 타입(reference type)으로 나눠지는데 기본 데이터 타입을 객체로 표현해야 하는 경우가 있는데 이럴 때에 기본형 타입을 객체로 다루기 위해 사용하는 클래스들을 말한다.

  |기본타입 | 래퍼 클래스|
  |:------:|:------:|
  |byte|Byte|
  |char|Character|
  |int|Integer|
  |float|Float|
  |double|Double|
  |boolean|Boolean|
  |long|Long|
  |short|Short|

## <> - generic
>데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
- 묵시적으로 변한 객체를 명시적 캐스팅을 하지않고 형변환을 도와주는 것 . 즉 타입을 체크하고 변환이 필요 없다. 
- 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
- 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다.

	|타입 |설명|
	|:------:|:------:|
	|`<T>`|Type|
	|`<E>`|Element|
	|`<K>`|Key|
	|`<V>`|Value|
	|`<N>`|Number|
 

### 1.5 이후 형변환을 사용시
```
VectorTest01refactoring.java:29: warning: [unchecked] unchecked call to add(E) as a member of the raw type Vector
```
라는 경고메세지가 뜬다. 

`<String>` 이라고 지정을 해주면 그 들어오는 객체는 오브젝트로 잡는것이 아닌 제네릭으로 지정해준 String 만 들어갈수 있다. 
 
# 08_25 용어 정리

## 자료구조 - Collection 
  ### Stack 
  - FILO - 첫번째 들어간것은 마지막에 나온다. ex) 컵 
  ### Queue 
  - FIFO - 첫번째 들어가면 첫번째로 나온다. ex ) 터널
  
## StackTrace
- main을 실행했는데 문제가 발생하면 JVM 이 예외가 발생한 부분에 `new Exception` 을 생성하고 `Throw` 라는 키워드로  에러를 던져준다.

## thread 
- 추적

## inherited 
- 상속된...? 

## Handling 
- 처리

# 08_26 용어 정리

## IDE 
- 통합 개발 환경

## Process
- 간단히 말해서 **실행 중인 프로그램(program)**이다.
- application이라고도 말할 수 있다.

## Unicode
- 전 세계의 모든 문자를 컴퓨터에서 일관되게 표현하려고 설계된 산업 표준.  
   유니코드 협회가 제정한다.
- UTF-8 ,UTF-16
  
# 08_27 용어 정리
