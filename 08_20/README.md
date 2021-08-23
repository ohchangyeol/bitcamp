# 08_20 수업정리
## abstract 
> 구상 or 추상적으로 만들어 놓을때 쓰이는 키워드  
 **`무조건 오버라이딩이 되어야 한다.`**
 - `구체적으로 만들지않음`. 
 - 형태만 `charge()`; 까지만 만들고 앞에 `abstract` 붙힘 
 - 오버라이딩을 하지않으면 상속된 부모의 매서드로 넘어가기 때문에 그값을 추상만 한다는 의미
 - `class까지 abstract` 붙혀야한다. 그래야 인스턴스 생성을 막고 형태만 잡아놓은 method 사용을 막을수 있기 때문이다. 
	   
        제품에 부품은 빠졌는데 생성이 가능한가? 
        자손클래스를 통해 제품의 부족한 부품을 채워넣어 생성이 가능하기 때문이다.

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