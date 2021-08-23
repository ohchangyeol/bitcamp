public class Example3{

 //main method
 public static void main(String[] args){
 
  int i = Integer.parseInt(args[0]);
  int j = Integer.parseInt(args[1]);

  int sum = 0;
  // 큰값과 작은값이 들어갈 공간
  int smallCup = 0;
  int bigCup = 0;

  if ( i != j) { // i와 j가 같은 값이 아니라면 아래 블럭을 실행한다.
   if ( i < j ) { // j가 더크면 작은 리터럴 값은 작은컵으로 큰 리터럴값은 큰값으로.
    smallCup = i ; 
    bigCup = j ;
   }else{ // 만약 i가 크다면? 
    smallCup = j ; //작은 값을 작은 컵으로
    bigCup = i ; //큰 값을 큰컵으로.
   }
   for (int k = smallCup; k <= bigCup ; k++) { 
    sum += k ;
	if (k == bigCup){
	  bigCup=0;
	  smallCup=0;
	  break; // 초기화
	}
   }
    System.out.println(i + " ~ " + j + "의 합은 " + sum + "입니다."); 
  }else {
   System.out.println("입력값이 같습니다.");
  }


  

 } //end of main

}// end of class


