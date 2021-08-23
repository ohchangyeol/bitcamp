//package jb03.part07;

/*
*  FileName : TestApp.java 
*   �� �Ʒ��� ������ �����ϸ�
*        ==> Class �� Object(instance)�� ����� template �̴�
*        ==> ��ü�� ���¸� ���´�. (�׷���.. �Ʒ��� ���� �ڵ��ϸ� ��������.....)
*        ==> ��ü�� �ĺ����� ���´�.
*/
public class TestApp{
	///Field
	///Method
	///Main Method
	public static void main(String[] args){
		
		// Developer2.class �� Instance ȭ ��.
		Developer2 d1 = new Developer2();
		Developer2 d2 = new Developer2();
		Developer2 d3 = new Developer2();
		
		// d1, d2, d3 �ĺ����� ���� Instance �� .�����ڸ� ���� ���
		System.out.println("h1�� �̸��� : "+d1.name);
		System.out.println("h2�� �̸��� : "+d2.name);
		System.out.println("h3�� �̸��� : "+d3.name);

		System.out.println("======================");
		//�Ʒ��� ������ ��������.
		d1.name = "ȫ���";
		d2.name = "�̼���";

		// d1,d2, d3 �ĺ����� ���� Instance �� .�����ڸ� ���� ���
		System.out.println("h1�� �̸��� : "+d1.name);
		System.out.println("h2�� �̸��� : "+d2.name);
		System.out.println("h3�� �̸��� : "+d3.name);
		
	}//end of main

}//end of class