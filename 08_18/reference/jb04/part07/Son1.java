package jb04.part07.outer;
import jb04.part07.Father;
/*
	FileName : Son1,java

	1. Encapsulation(information hiding)�� �����ϴ� Access Modifier ����
	2. public / protected /       / private �� ��� �� ���� 

	�� Son1�� Father �� �ٸ� package�� ����, ��Ӱ���
	�� �ּ��� Ǯ�� 
	      ==> Compile �� error �� Ȯ���ϰ�, error �� �ǹ� ����
	      ==> �� Access Modifier �� ���ٹ����� Ȯ���� ��  
*/
public class Son1 extends Father{
	
	///Field
	
	///Constructor
	public Son1(){
		System.out.println(this.name);		//==> public String name = "ȫ�浿";
		System.out.println(bank);		        //==> protected String bank = "�Ѿ�����";
		System.out.println(branch);	     	//==> String branch="���ﵿ����";
		System.out.println(password);  	//==> private int password = 1234;
		
		//==> Field(��������)�� Method(����)�� �̿� ����
		System.out.println(this.getBranch());
		System.out.println(getPassword(0));
	}
}//end of class

/*
	1. private �� ����Ͽ� �ٸ� class �� ���� ���� ��������
	2. method �� ����(������ ����) �������� ������ ����
*/