08_20 수업정리
=====
# Java 

## 상속 관계 형변환

 - ### 묵시적 형변환 
    > 자손클래스에 있는 추가된 기능은 사용할 수 없다.   
    하지만 overriding 된것은 자신의 기능에 upgrade했기 때문에 사용이 가능하다.
    ```java
    public class 부모클래스{
        public void print(){
            System.out.println("부모 클래스의 메서드를 호출");
        }
    }
    public class 자식클래스 extends 부모클래스 {
        public void print(){
            System.out.println("부모 클래스의 메서드를 overriding한 메서드를 호출");
        }
    }
    public class 실행클래스{
        public static void main(String[] args){
            부모클래스 a = new 자식클래스();
            a.print(); 
            //결과 값 : 부모 클래스의 메서드를 호출
        }
    ```
	
  - ### 명시적 형변환 
    > 자손클래스의 추가된 기능을 다시 사용하게 하기 위해 명시적`(자손)`으로 사용해 다시 사용할 수 있다.
    ```java
    public class 실행클래스{
        public static void main(String[] args){
            부모클래스 a = new 자식클래스();
            자식클래스 b = (자식클래스)a;
            b.print(); 
            //결과 값 : 부모 클래스의 메서드를 overriding한 메서드를 호출
        }
    ```