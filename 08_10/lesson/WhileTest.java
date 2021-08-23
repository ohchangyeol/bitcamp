//package jb02.part02;

/*
 FileName: WhileTest.java
 1. while(조건)
 2.do..while (조건)
 활용 및 차이점을 확인
*/
public class WhileTest{
 public static void main(String[] args){
 
  //while문
  int i =0;           //#1. 순환문의 조건을 주기위한 int i 초기화
  while (i<10){     //#2. 조건 (boolean data type)
  //while (0){
   System.out.println("여기는 while문 내부 안임 i  = "+ i);
   i++; // #3. 증감식
  }

  //do-while문
  int j =0;       //#1. 순환문의 조건을 주기위한 int i 초기화
  do {
   System.out.println("여기는 do문 내부임 j = "+j);
   j++;         // #2. 증감식
  }while(j < 1); // #3. 조건(boolean data type)
  System.out.println("\n=====================\n");

  //while 문을 이용하여 5단을 출력하는 프로그램
  int k =1;
  while (k<10){
   System.out.println("5 * " +k+ " = "+5 * k);
   k++;
  }
  //==> 무한루프와 무한루프 후 단의 실행문에서 compile error 이해.
  while (true){
   System.out.println(" 여기는 반복문 내부의 무한 지옥 루프");
  }

  // ==> 아래 주석을 풀면 compile error 가 발생한다 이유는...
  //System.out.println("error가 발생한다 이유는... 위에 while 문이 끝나지않는 여정을 걷기 때문이 아닐까...?");

 } //end of main

}// end of class


