//package jb02.part06;

/*
	FileName : ���������帶ī.java
	:  ���Ǽ���(Real World)�� ������ �繰(��ü)�� "�Ӽ�,���"�� Java �� class �� ǥ��
	:  Bean /  POJO (Plain Old Java Object)
*/
public class  ���������帶ī{
	
	///����/�Ӽ� ����==>Field 
	String �̸� = "������ ���帶ī";
	String Į�� = "������";
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