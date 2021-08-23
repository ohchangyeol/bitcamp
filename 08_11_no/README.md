# 08_11 수업정리

### Data Type 
>  `byte`(1byte), `short`(2byte), `int`(4byte), `long`(8byte), `float`(4byte), `double`(8byte), `char`(2byte) , `boolean`(1byte)

- 기본형데이터 타입 
  
  ---
  사용성이 좋음, 다만 변수가 많아지면 관리하기 힘듬.  

  - 정수형 타입  
    `byte`, `short`, `int`, `long`
  - 실수형 타입  
    `float`, `double`
  - 문자형 타입  
     `char`
  - 논리형 타입   
    `boolean`
- 참조형 데이터 타입 

  ---
  묶음성이 좋음. 

  - 배열 - `array[ ]`
  - 열거 - `enum`
  - 클래스 - `class`
  - 인터페이스 - `interface`


### Casting - 형변환
	
- 묵시적 형변환

    ---
	작은 데이터는 큰 데이터로 자동변환  
	int 보다 작은 값을 연산할땐 무조건 `int`로 반환
	```java
    byte sByte = 0 ;
    int bInt = 0 ;
    int sum = sByte + bInt; //==> int
    ```

- 명시적 형변환

    ---
    작은 데이터를 큰 데이터로 강제로 명시함.  
    ```java
	byte sByte = 0 ;
    int bInt = 0 ;
    byte sum = (byte)bInt;

    byte c = sByte + bInt ; //-> 오류 - 그릇이 다름.
    ```

