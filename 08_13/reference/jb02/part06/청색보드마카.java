//package jb02.part06;

/*
	FileName : û�����帶ī.java
	:  ���Ǽ���(Real World)�� ������ �繰(��ü)�� "�Ӽ�,���"�� Java �� class �� ǥ��
	:  Bean /   POJO (Plain Old Java Object)
*/
public class  û�����帶ī{
	
	///����/�Ӽ� ����==>Field 
	String �̸� = "û�� ���帶ī";
	String Į�� = "û��";
	int ��ũ�� = 100;
	
	///���� ==> method
	public void ����ϴ�(){
		��ũ��--;
	}
	
	public boolean ��밡������(){
		if (��ũ�� == 0){
			return false;
		}else{
			return true;
		}
	}
	
}//end of class