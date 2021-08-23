# 08_19 수업정리

## 수업 복습

- 패키지는 디랙토리라 카멜케이스를 쓰지않는다.

- access Modifirer( 엑세스 모디파이어 ) - 접근제어자
    > public, Private ...

- Modifirer(모디파이어) 제어자
    > static, final ...

- 자바는 실행시 위에서 static을 먼저 우선으로 찾는다 .  
만약 method가 static 이라면 실행이 되는게 아니라` 메모리에 올라간다`.

- 자바 버츄얼머신(JVM)이 최초로 시작하는 메서드는 main 이라 static으로 선언되어 있기 때문에 메모리에 먼저 할당되어있어 실행이 되는것.

- new는 생성 x  
    > 메모리 적재 후 생성자 호출.

- 순서대로 변수 메서드 선언하고 생성자 호출

- static이 붙은 메서드는 이미 메모리에 적재 되어있어 인스턴스로 만들지 않아도 class이름으로 불러도 동작한다. 
    > Field , method
    ```java
    className.FieldName
    className.methodName();
    ```

- 남자고등학교 학적시스템만들때 **대한민국**, **남자** **통일 된것을 static**을 쓴다. 
---

## static 
> 공통적인 의미를 갖고있다.`인스턴스를 사용하지않고 class이름만 알고있다면 호출`이 가능하다. 클래스가 메모리에 적재될때 `첫번째 순서`로 로드된다.
  
  - field , method 에 가능  
	
        static int field
         변수는 어디서나 사용할수 있는 변수가 된고 상태값을 변경하면 class변수를 쓰고있는 모든 class 들의 값이 변경.
         
	    static method 
        인스턴스 없이 호출이 가능하고 다른 값을 리턴받는 abs 같은 느낌??? static method는 그 class안에 있는 field 변수를 사용할 수 없다.

## final 
> 마지막 . 변경할수 없다.  
> `class`,`Field`, `method`에 사용가능

- final class - 상속이 불가능하다. 자식을 만들수 없다(다른클래스의 조상이 될수 없다.)
- final field - 값을 변경할 수 없는 상수가 됨.
- final Method - 오버라이딩이 불가능하다.  

## 리드 온니 클래스???
> 프라이빗과 겟터매서드를 이용해 리드온니 클래스를 만들 수 있다.  
>프라이빗을 생성자 매서드에 넣으면 인스턴스 할수 없다.
