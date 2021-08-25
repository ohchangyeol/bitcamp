//package jp03.part01;

/*
 FileName :  ReaderTest.java
  
 1. java.io package :  ���α׷� �ܺη� �ڿ��� �ްų�, ���� ��쿡 ���
 2. keyboard �� ���� data �� �о� ���̸�

InputStream �� �ѱ�ó��[2byte]�� ���� ����
���ڸ� ó���ϴ� Reader �迭�� �����ϸ�~
 */
import java .io.*;

public class ReaderTest{
	
	//Main method
	public static void main(String args[]){

		try{
			
			// InputStream ǥ���Է���ġ �߻�ȭ class
			InputStream inputStream = System.in;
			// InputStream�� Reader �� ���� (byte ó�� >> ����ó�� ����)
	        Reader reader = new InputStreamReader(inputStream);			
	        
			System.out.println("�Է��� ��ٸ��ϴ�....... ");
			
			//���� �д� ���� loop �� ����.
        	while(true){

        		//1. java.io �� ����(block)�ɼ� �ִ�.
				int i = reader.read();
				char c = (char) i;

				//2. java.io ��  FIFO�� ����
				System.out.println("�Է��Ͻ� �� : "+c);

				//char  'x'�� �Է½� while ����
				if(c=='x'){
					inputStream.close();		 
					break;
				}
				
			}
		}catch(IOException e){
			e.printStackTrace();
		 }
		
	}//end of main
}//end of class