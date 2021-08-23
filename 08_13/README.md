# 08_13 수업정리

## return 

  - `돌려받다` or `끝내다`. 
  - 돌려받을시엔 무조건 `value`값만 돌려 받을 수 있다.
  
    전달받은 값의 `return data type`이 같아야 한다.

    ```java
    boolean isBool = false;
    for (int i = 0 ; i <  10 ; i++ ){
      if (i == 5 ) {
          return; // 끝내다.
          // return isBool = true; // isBool 값을 true로 돌려받다.
      }
    }
    
    ```
  ### method의 return
  - void의 생략 값을 전달받는다?  
  - `void 는 return을 받지 않는다.`
    ```java
    public int pulsInt (int i ) {
      i += 1 ;
      return i;
    }
    ```
## Field에 선언시 default값

- ### **정수형** 타입 ==> `0` 
  - `byte` = 0
  - `short` = 0
  - `int` = 0
  - `long` = 0L
- ### **실수형** 타입 ==> `0.0`
  - `flaot` = 0.0F
  - `double` = 0.0
- ### **논리형** 타입 ==> `false`
  - boolean = false
- ### **참조형** 타입 ==> `null`
  - `String` = null
  - `class` = null
  - `array[]` = null
  - `interface` = null
  

## App / Bean
 - bean은 real world 를 표현한것. `main`이 없다.
 - bean을 실행하려면 app이 필요하다.