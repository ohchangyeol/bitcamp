public class Example3{

 //main method
 public static void main(String[] args){
 
  int i = Integer.parseInt(args[0]);
  int j = Integer.parseInt(args[1]);

  int sum = 0;
  // ū���� �������� �� ����
  int smallCup = 0;
  int bigCup = 0;

  if ( i != j) { // i�� j�� ���� ���� �ƴ϶�� �Ʒ� ���� �����Ѵ�.
   if ( i < j ) { // j�� ��ũ�� ���� ���ͷ� ���� ���������� ū ���ͷ����� ū������.
    smallCup = i ; 
    bigCup = j ;
   }else{ // ���� i�� ũ�ٸ�? 
    smallCup = j ; //���� ���� ���� ������
    bigCup = i ; //ū ���� ū������.
   }
   for (int k = smallCup; k <= bigCup ; k++) { 
    sum += k ;
	if (k == bigCup){
	  bigCup=0;
	  smallCup=0;
	  break; // �ʱ�ȭ
	}
   }
    System.out.println(i + " ~ " + j + "�� ���� " + sum + "�Դϴ�."); 
  }else {
   System.out.println("�Է°��� �����ϴ�.");
  }


  

 } //end of main

}// end of class


