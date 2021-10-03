09_30
----

# Spring - part 2

## IOCcontainer란?
제어역전 - 제어의 흐름을 바꿔주는 컨테이너  
내가 잘못 선택한 것에 대한 책임을 져야하는 현상을 해결하기 위해??
제어의 흐름을 바꾸지 않는 다면 의존적인 (하드코딩) 형태가 생긴다.

하드코딩을 하게 된다면 커플링 관계가 형성이 되는 데 그것을 약간이라도 낮춰 주기 위해 interface기반 코딩을 한다 그래도 Loose Coupling 현상이 발생한다.

- ApplicationContext
> ApplicationContext는 ApplicationContext가 로드될 때 작성한 bean이 인스턴스 생성이 된다. bean life cycle에 참여할 때 사용할 수도 있다. **라이플 사이클에 참여할 땐 해당 Aware를 구현해야 사용 가능 하지만 사용하게 된다면 프레임워크에 종속적이게 된다.**  
리이프 사이클에 참여할 때 속성 값에 넣어 사용할 때 인스턴스 호출시 생성되는 것을 LookUp 이라 한다. (설명 생략.)   
협업시 meta data도 모듈화가 가능하고, 해당 모듈을 실행 연결 가능.
- BeanFactory 
> 동일한 기능이지만 BeanFactory 같은 경우, getbean을 할때 인스턴스 호출을 진행하고 해당하는 값을 setting 해준다.

## xml - meta data
Loose Coupling을 낮춰주기 위해, 그리고 Spring 프레임워크를 사용하기 위해, 그 프레임 워크랑 연결하기 위한 데이터 파일 ??
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans 	xmlns="http://www.springframework.org/schema/beans"
				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xsi:schemaLocation="http://www.springframework.org/schema/beans
													  http://www.springframework.org/schema/beans/spring-beans.xsd">												 
		<bean id="user06" class="spring.service.domain.User">
			<constructor-arg value="60" index = "0"/>
			<constructor-arg value="60유저" index ="2" />
			<constructor-arg value="6060" index ="1" />
		</bean>
		
		<bean id="user07" class="spring.service.domain.User">
			<constructor-arg value="70유저" type="java.lang.String"/>
			<constructor-arg value="70" type ="int" />
			<constructor-arg value="7070" index ="1" />
		</bean>
		
		<bean id="prodertyConfigurer" class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
			<property name = "location" value="config/userservice02.properties" />
		</bean>
		 
		<bean id="user08" class="spring.service.domain.User">
			<property name = "age" value="${user.age}" />
			<property name = "userId" value="${user.userId}" />
			<property name = "password" value="${user.password}" />
		</bean>
</beans>
```

setter / constructor 를 사용할 수 있다. 
- property  
setter 메서드를 호출시켜 해당하는 값을 바꿔줌.
- constructor-arg  
생성자를 통해 필드의 값을 변경해줄 때 사용. **사용시 순서가 중요함** 또는 해당 데이터 타입을 맞춰준다.

