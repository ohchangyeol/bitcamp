//package jp03.part01;

/*
 FileName :  InputTest.java
  
 1. java.io package -  ���α׷� �ܺη� �ڿ��� �ްų�(?), ����(?) ��쿡 ���
 2. keyboard �� ���� data �� �о� ���̸�~
 */
import java .io.*;

public class InputTest{

	///Main method
	public static void main(String args[]){
		
		// InputStream ǥ���Է���ġ �߻�ȭ�� class
		InputStream inputStream = System.in;
		
		System.out.println("�Է��� ��ٸ��ϴ�....... ");

		try{
		
			// ���� �д� ���� loop ����.
			while(true){
					
				//1. java.io ����(block)�ɼ� �ִ�.
				int i = inputStream.read();
				char c = (char) i;

				//2. java.io FIFO�� ����
				System.out.println("�Է��Ͻ� �� : "+c);

				//char  'x'�� �ԷµǸ� while ����
				if(c=='x'){
					inputStream.close();		 
					break;
				}
				//�ѱ��Է½� ����? �ѱ� 1���ڴ� > 2�� ����� ���� Ȯ��
			}

		}catch(IOException e){
			e.printStackTrace();
		 }
		
	}//end of main
}//end of class