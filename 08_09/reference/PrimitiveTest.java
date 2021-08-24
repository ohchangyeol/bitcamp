//package jb1.part04;

/*
  FileName : PrimitiveTest.java
  1. Java���� �����Ǵ� 8EA�� Primitive Data type�� ����
  2. Variable declaration (��������)�� Variable Assignment(���Ǵ���)
*/

public class PrimitiveTest{
  //main method
  public static void main ( String[] args ){
    
    //������
    boolean boo = true;

    //������
    char c = 'ȫ';

    //������ 
    byte b = 127;
    //������ �Ѿ�� ���� ���� ��쿣 ���� �߻� =>compile error �߻� (Ȯ�ο��)
    //byte b1 = 128;
    
    short s = 1000;
    int i = 1000;
    long l = 1000L;     //<== long�� ��� 000l �Ǵ� 000L�� int�� ����

    //�Ǽ���
    float f = 1000.5F ;     //<== float�� ��� 000F �Ǵ� 000f�� double �� ����
    double d = 1000.5;
	//b=i;
    // print()�� println()�� ������ <== �������� Ȯ����
    System.out.print("�ڹ��� primitive Data type��++" );
    System.out.println("::����Ͽ� ǥ����� ��ġ�� ,,," +  "::���");
	//System.out.println(b);
    //+�������� �ǹ� (���ڿ� +�����ڰ� ���Ǹ� append)
    System.out.println("������ :" +boo);
    System.out.println("������ :" +c);
    System.out.println("������ byte :" +b);
    System.out.println("������ short :" +s);
    System.out.println("������ int :" +i);
    System.out.println("������ long :" +l);
    System.out.println("�Ǽ��� float :" +f);
    System.out.println("�Ǽ��� double :" +d);

  }//end of main
}//end of class