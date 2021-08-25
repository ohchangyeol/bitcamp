//package jp03.part03;

import java.io.*;

/*
* FileName : FileInputStreamTest.java
*/
public class FileInputStreamTest{

	//main method
	public static void main(String[] args) {

		//File을 읽어들이는 Stream 선언
		FileInputStream fis = null;
		//read()수 count 위한 변수
		int readCount = 0;

		try{
			fis = new FileInputStream(args[0]);

			While(true){
				int i = fis.read();

				if(i == -1){// i = -1의 의미는 ==>  API확인할 것.
					break;
				}

				char c = (char)i;
				System.out.prin(c);

				readCount++;
			}

		    }catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e1){
				e.printStackTrace();
			}finally{
				System.out.println("\n\n================================");
				System.out.println("\n\n================================");
				System.out.println("\n\n================================");
			try{
				fis.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}//end of main

}//end of class


{
}
