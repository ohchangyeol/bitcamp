# 08_23 수업 정리

## 용어 정리 해야할 것들
	ASCII code - 아스키코드
	인코딩
	엔코딩
	다이아몬드 프러블럼
---
## 수업 복습

- this ,super에 대한 복습
- instance 묵시적 형변환
- static , abstract 간단 정리
- 버스차지를 이용해 다형성 복습

---

## abstract class - 추상 클래스

> 인스턴스 생성불가

## interface 
> pure abstract class - 순수한 추상클래스

 - abstract를 생략
 - 상속, 공유가 불가.
 - 리얼리제이션을 구현
 - 구현되지않는 것을 실체화 함.
 - 특별한 클래스
 - 추상된 기능을 빼놓는 것.
 - 기능을 통일을 위한 인터페이스 사용
 - modeling시 기능의 정의를 해서 재사용성을 높힘
 - 다중 상속 가능.
 
### 왜 써? 
 > 그 기능을 다른곳에서 쓰기 위해.

 -  일반화 되지않는 것에 상속을 해 abstract 하는것보다 인터페이스를 이용해 볼륨 이라는 기능만 정의해 놓으면 어디서든 쓸수 있다.

## ~is a~
 - `Specialization`, `Generalization`, `Realization`  
 - ~는 ~이다. 
 - 키워드가 있음. `extends` , `implements`

## dependency, Association 
- 테크닉??

## dependency
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
## Association
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
## Interface
- 인터페이스에 모든메서드는 abstract 가 붙는다.
- field 는 final static 이 붙는다.
- 인터페이스는 완전한 추상 메서드
- `abstract는 어떤것은 추상 어떤것은 일반 메서드`.

**Deposit,PayOut 이 Interface일 때** - ** **08_17 part08 참고** **
```java
	System.out.println(Deposit.deposit);    //==>static의 접근방식은 ?
	System.out.println(hb.payOut);          //==>static의 접근방식은 ?

	//field 의 상태값을 변경해보자.
	Deposit.deposit="입금";
	PayOut.payOut="출금";
	//==> compile Error 발생 interface에 선언되는 변수는 final static의 특징을 갖음
```

용어 정리 할것

## 인스턴스 변수
- 멤버변수
- field에 있다
## localVariable 
- 지역변수 클래스영역 이외의 영역
- 메서드. 생성자, 초기화 블럭 내부
- 초기화가 되지않으면 사용할때 에러가 발생한다.

## Garbage 
- 메모리에 떠있고 사용할수 없는 istance 를 말한다
## garbage collector 
- Java에서는 개발자가 프로그램 코드로 메모리를 명시적으로 해제하지 않기 때문에 더 이상 필요 없는 객체를 찾아 지우는 작업을 하는 애
## garbage collection 
- JVM의 가비지 컬렉터가 불필요한 메모리를 알아서 정리

## Object class 
- `java의 최상위 class`다. (API의 최상위 클래스)

## toString()
- reference변수를 찍으면 내부적으로 toString()을 찍는다.
	```java
	Test test = new test();
	System.out.print(test.toString());
	System.out.print(test); // toString()생략
	// 결과값 test@123213~~~
	```
- toString 을 찍으면 왜 쓰레기 값이 나오는지? api 참고 
	```java 
	getClass().getName() + '@' + Integer.toHexString(hashCode())
	```
## String class의 toString()
- Object의 toString() 메서드를 오버라이딩 함 .

```java
	String name = "오창열";
	String str = name;
	System.out.println(str.toString());
	System.out.println(str);// toString() 생략
```

## equals()
- 레퍼런스형 타입의 상태값을 비교하고 싶을 때
	```java
	B b1 = new B(1,"홍길동");
	B b2 = new B(1,"홍길동");
	System.out.println("b1.equals(b2) : "+b1.equals(b2)); //==> false
	```
	### 왜 False 일까?
 - 오브젝트가 참조하는 주소값?이 다르기 때문에 b1 == b2와 같은 원리다.  
	```java 
    public boolean equals(Object obj) {
        return (this == obj);
    }
	```
	### 참조변수의 상태값을 비교하려면?
  	```java
	class B{
		//Field
		int no = 1;

		//overriding
		public boolean equals(Object obj) {
     	   return (this.no == ((B)obj).no);
    	}
	}
	```
	> B는 Object의 상속임으로 equals안에 매개변수로 넣게 되면  B는 Object로 `묵시적 형변환`이 되기 때문에 B에 있는 상태값을 사용할 수 없다. 그래서 `명시적 형변환`을 이용한다.
	```java
	public class Tset{
		//Main Method
		public static void main(String[] args){
			B b1 = new B();
			B b2 = new B();
			System.out.print(b1.equals(b2)); // true
		}
	}
	
	```

b2는 Object로 묵시적 형변환이 되기 때문에 b 에 있는 no를 가져올수 없게 되는것
그것을 가져오기 위해 명시적 형변환을해줘야 함.