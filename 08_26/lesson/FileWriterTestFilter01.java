//package jp03.part05;
import java.io.*;

/*
*FileName : FileWriterTestFilter01.java
*
* ==>FileCopy �ϴ� App �ۼ�
1.Keyboard�� FileName�� �Է�
2.File�� ������ read() ==> FileReader
3.File�� ������ write() ==> FileWriter
*/

public class FileWriterTestFilter01{
	//main method
	public static void main(String[] args)throws Exception{




		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName = "";
		String copyFileName = "";

		int readCount = 0; // read�� Count �ϱ����� ����
		
		System.out.print("copy�� file �̸��� �Է��ϼ��� : ");
		//copy�� FileName �Է¹ޱ�,,
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();


		//�������� Data�� read �� �� �ִ� BufferedReader ����
		br = new BufferedReader(new FileReader(fileName));


		//�纻 ���� �̸� �����
		copyFileName = fileName + " _copy";

		//Data�� write�� �� �ִ� BufferedWriter ����
		bw = new BufferedWriter(new FileWriter(copyFileName));

		//read / writer �ϴ� while ��
		String source = null;

		while((source=br.readLine()) != null){
			bw.write(source);
			readCount++;
			}

		bw.flush();	//flush�� ���� ����

		//Stream close()
		bw.close();
		br.close();

		System.out.print("======================= ");
		System.out.print("===>> readȽ�� readCount : " + readCount);
		System.out.print("======================= ");

	}//end of main
}//end of class