package jb02.part06;

/*
	FileName : ���帶ī.java
	:  ���Ǽ���(Real World)�� ������ �繰(��ü)�� "�Ӽ�,���"�� Java �� class �� ǥ��
	:  ==> ����� ��ü(������,û��,������ ������Ŀ��.. )�� �Ϲ���,������ Ư��,������
	    ==> ���� ��ü�� ���Ӹ� Ŭ������ ǥ��  
 	:  Bean /  POJO (Plain Old Java Object)
*/
public class  ���帶ī{
	
	///����/�Ӽ� ����==>Field 
	String �̸�;
	String Į��;
	int ��ũ��;

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
	
	///setter method
	public void set�̸�(String �̸�)		{
		this.�̸� = �̸�;
	}
	public void setĮ��(String Į��)		{
		this.Į�� = Į��;
	}
	public void set��ũ��(int ��ũ��)	{
		this.��ũ�� = ��ũ��;
	}

}//end of class