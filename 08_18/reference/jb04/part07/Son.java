package jb04.part07;

/*
	FileName : Son,java
	
	1. Encapsulation(information hiding)�� �����ϴ� Access Modifier ����
	2. public / protected /       / private �� ��� �� ���� 

	�� Son �� Father �� ���� package �� �����ϸ�, ��Ӱ����̴�.
	�� �ּ��� Ǯ�� 
	      ==> Compile �� error �� Ȯ���ϰ�, error �� �ǹ� ����
	      ==> �� Access Modifier �� ���ٹ����� Ȯ��  
*/
public class Son extends Father{
	
	///Field
	
	///Constructor
	public Son(){
		System.out.println(this.name);    	//==> public String name = "ȫ�浿";
		System.out.println(bank);		        //==> protected String bank = "�Ѿ�����";
		System.out.println(branch);	        //==> String branch="���ﵿ����";
		//System.out.println(password);		 //==> private int password = 1234;
		
		//==> Field(��������)�� Method(����)�� �̿� ����
		System.out.println("���� ��й�ȣ: "+ this.getPassword(0));
	}
}//end of class

/*
	1. private �� ����Ͽ� �ٸ� class �� ���� ���� ��������
	2. method �� ����(������ ����) �������� ������ ����
*/