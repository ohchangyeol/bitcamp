public class Example2{

 //main method
 public static void main(String[] args){
 
  int inputInt = Integer.parseInt(args[0]);

  if (inputInt >= 0 && inputInt <= 10 ) {// input���� 0���� Ŭ��, input���� 10�� ���ų� Ŭ��.
   System.out.println( inputInt + " ���� ����մϴ�." );
   for (int i = 1 ; i <=9 ; i++ ){
    System.out.println( i + " * " + inputInt + " = " + i * inputInt);
   }
  }else {
   System.out.println("1 ~ 9 ������ ���� �Է��� ��.");
  }
 } //end of main

}// end of class


