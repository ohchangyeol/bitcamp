# 08_12 수업정리

## 증감식

- ### 후치 

  ---
  선 대입 후 증가 
  ```java
  i++;
  int j = i++;
  ```
- ### 선치
  
  ---
  선 증가 후 대입
  ```java 
  ++i;
  int j = ++i;
  ```

## if( 조건 ){ 실행문 }
  - 안의 조건에는 무조건 `boolean`으로 입력해야한다. 
    ```java
    boolean isBool = false;
    if(isBool){
        System.out.print("참이라면 실행");
    }

    if(0){// java에서 0과 1은 int로 분류한다.
        System.out.print("참이라면 실행");
    }
    ```
## while, do-while

- ### do-while 
  
  ---
  일단 무조건 한번 실행 하고 조건이 false로 나올때까지 실행

  ```java
  int i = 0;
  do{
        System.out.print("참이라면 실행");
  }while(i < 10);
  ```
- ### while
  
  ---
  조건이 맞지않다면 한번이도 실행 안될수도 있음.
  ```java
  int i = 0;
  while(i < 10){
    System.out.print("참이라면 실행");
  }
  ```
## break, continue

- ### break;

  ---
  말그대로 반복문이나 조건문에 만나면 밖으로 나간다.
  ```java
  for (int i = 0 ; i < 10 ; i++){
      if(i == 5){
          break;
      }
      System.out.print(i + " ");
  }
  ```
  ```
  결과 값 = 0 1 2 3 4
  ```


- ### continue;

  ---
  간단하게 pass 같은 느낌.  
  수행은 하나, 건너뛰고 반복문을 다시 실행한다.
  ```java
  for (int i = 0 ; i < 10 ; i++){
      if( i % 2 == 0 ){
          continue;
      }
      System.out.print(i + " ");
  }
  ```
  ```
  결과 값 = 1 3 5 7 9 
  ```

## Call by Value

-  
   ```java
   int a= 10; // a 의 리터럴은 10( value )  
   int b= a; // b는 a를 기본형이기에 a는10 -> 즉슨 10을 가져온다.
   ```
## Call by Reference

- 
  ```java 
  int[]i = {1,2,3,4}; // arr = 참조형
  int[]j = i; /// i 가 가지고 있는 arr 를 갖고 오는게 아닌 i의 참조형 데이터를 갖고옴
  ```


