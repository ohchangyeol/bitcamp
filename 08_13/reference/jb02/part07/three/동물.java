package jb02.part07.three;

/*  
	FileName : ����.java
	:: �繰/������ "�Ӽ�,���"�� Object Modeling �Ͽ� java class ǥ��
	::  Bean /  POJO (Plain Old Java Object)
*/

// ����.class: �߻�ȭ / �Ϲ�ȭ ������ ����,  �ٸ� class �� ��ӵ����� ���.
public class  ����{
	
	///Field(Attribute)
	String �̸�;
	String �̵����;
	//int ��������;
	//int ��ũ��;
	//int ��������ũ��;
	
	///Method(behavior)
	public void �̵��ϴ�() {
		System.out.println( �̵���� + "���� �̵���");
	}

	//��Ÿ Method ����

}//end of class


//==> ������.class : ����.class �� ���(����)�޾� ������ class �𵨸�
class  ������ extends ����{
	
	///Field(Attribute)
	//String �̸�;
	//String �̵����;
	int ��������;
	
	///Method(behavior)
	//public void �̵��ϴ�(){
	//	System.out.println( �̵���� + "���� �̵���");
	//}
	
	//��Ÿ Method ����

	}//end of class


//==> �ڳ���.class : ����.class �� ���(����)�޾� �ڳ��� class �𵨸�
class  �ڳ��� extends ����{
	
	///Field(Attribute)
	//String �̸�;
	//String �̵����;
	int ��ũ��;
	
	///Method(behavior)
	//public void �̵��ϴ�(){
	//	System.out.println( �̵���� + "���� �̵���");
	//}
	
	//��Ÿ Method ����

}//end of class


//==> ��.class :����.class �� ���(����)�޾� �� class �𵨸�
class  �� extends ����{
	
	///Field(Attribute)
	//String �̸�;
	//String �̵����;
	int ��������ũ��;
	
	///Method(behavior)
	//public void �̵��ϴ�(){
	//	System.out.println( �̵���� + "���� �̵���");
	//}
	
	//��Ÿ Method ����

}//end of class