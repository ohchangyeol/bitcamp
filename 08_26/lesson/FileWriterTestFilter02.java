//package jp03.part05;
import java.io.*;

/*
*FileName : FileWriterTest.java
*
* ==>keyboard�� �Է¹��� ���� test.txt�� ������ Application �ۼ�
*/

public class FileWriterTestFilter02{
	//main method
	public static void main(String[] args)throws Exception{

		BufferedReader br = null;
		BufferedWriter bw = null;

		//keyboard �� �Է¹ޱ����� Sink Stream Reader ��
		//1���� line �� �б����� reanLine() method�� �����ϴ� BufferedReader ����
		//Reader r = new InputStreamReader(System.in);
		//br = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));

		//File �� ���� �������� FileWriter �� BufferWriter ����
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedWriter(fw);
		bw = new BufferedWriter(new FileWriter("test.txt"));	//==>APIȮ��
		//bw = new BufferedWriter(new FileWrither("test.txt",ture));	//==>APIȮ��

		System.out.println("ȭ�Ͽ� �����Ͻ� ���� �Է��ϼ���.");
		while(true){
			String str = br.readLine();
			if(str.equals("��")){
				break;
			}
			bw.write(str,0,str.length());	//==>API�� Ȯ������.
			bw.newLine();	//==>API�� Ȯ������.(�ٹٲٱ�)
		}
		bw.flush();	//flush�� ���� ����

		//Stream close()
		br.close();
		bw.close();
	}//end of main
}//end of class