public class Example2{

 //main method
 public static void main(String[] args){
 
  int inputInt = Integer.parseInt(args[0]);

  if (inputInt >= 0 && inputInt <= 10 ) {// input값이 0보다 클때, input값이 10과 같거나 클때.
   System.out.println( inputInt + " 단을 출력합니다." );
   for (int i = 1 ; i <=9 ; i++ ){
    System.out.println( i + " * " + inputInt + " = " + i * inputInt);
   }
  }else {
   System.out.println("1 ~ 9 까지의 값을 입력할 것.");
  }
 } //end of main

}// end of class


