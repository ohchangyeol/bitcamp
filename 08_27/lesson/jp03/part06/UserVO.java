package jp03.part06;

import java.io.*;

/*
*	FileName : UserVO.java
*
*	�� ȸ�������� ������ �ִ� UserVO :: ValueObject   ==> RMI / EJB (Value Object Pattern)
*	�� ȸ���� ������ ���� UserVO instance ��  file �� ����ɰ��̸�.. 
*	�� ��ü�� ������ڿ�, network �ڿ����� �̵��Ǳ� ���ؼ��� 
*	      Serializable �̶�� marker interface �� �����ؾ� �Ѵ�.		==> ��ü����ȭ... 
 */
public class UserVO implements Serializable{
	
	///Field 
	private int no;
	private String name;

	///Constructor
	public UserVO(){
	}
	public UserVO(int no,String name){
		this.no = no;
		this.name = name;
	}
	
	///method
	//setter method
	public void setNo(int no){
		this.no = no;
	}
	public void setName(String name){
		this.name = name;
	}
	//getter method
	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserVO [no=");
		builder.append(no);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}//end of class