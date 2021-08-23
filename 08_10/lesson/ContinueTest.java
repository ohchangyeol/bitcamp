//package jb02.part03;

/*
 FileName: ContinueTest.java
 ==> keyword : continue; ==> continue 이후 실행문을 중단, 다시 반복문 실행.

 continue 문을 이용해 짝수만 더하기.
 java ContinueTest 5 ==> 1~5중 짝수값 2,4를더한 6값을 출력.


*/

public class ContinueTest{

 //main method
 public static void main(String[] args){
 
  // 입력받은 data를 int 로 반환
  int inputData = Integer.parseInt(args[0]);

  // 더한 값을 저장하기 위한 변수 선언  
  int sum = 0; 

  for (int i = 0; i <= inputData ; i++ ){
	if (i% 2 == 1){
		continue; // 조건문에 해당하는 값은 실행을 중단하고 다음 값으로 넘어간다.
	}
	sum = sum+i;
	// 
  // ==> 아래의 내용은 for 순환문이 수행하며
  // ==> 변수의 값의 변화를 확인하기 위한 출력문 (debug)
  //System.out.println("i : " + i );
  //System.out.println("sum : " + sum );
  }

  System.out.println("0 ~ " + inputData + " 까지의 합은 : " + sum);
 } //end of main

}// end of class


