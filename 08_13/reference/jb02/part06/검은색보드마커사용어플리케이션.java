//package jb02.part06;

/*
	FileName : ���������帶Ŀ�����ø����̼�.java
	: Java Application class :  java ����� ���ʷ� ȣ��Ǵ� main method �� ���´�.
*/
public class  ���������帶Ŀ�����ø����̼�{

	///����/�Ӽ� ���� ==> Field

	///����   ==> method
	
	///main method ==> ����� JVM�� ���ʷ� ȣ��Ǵ� method
	public static void main(String[] args){
		
		///�ν��Ͻ��� ����ϱ� ���� class �� memory �� loading ( ==> new )
		���������帶ī �˺� = new ���������帶ī();

		///��ü�� ���� �Ӽ��� ���� ( ==> . ������)
		System.out.println("�˺� : "+�˺�.�̸�);
		System.out.println("�˺� : "+�˺�.��ũ��);
		
		///��ü�� ���� ������ ���� ( ==> . ������)
		if(�˺�.��밡������()){
			�˺�.����ϴ�();
		}

		///��ü�� ���� �Ӽ��� ���� ( ==> . ������)
		System.out.println("�˺� : "+�˺�.��ũ��);
		
	}//end of main

}//end of class