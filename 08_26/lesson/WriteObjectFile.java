//package jp03.part06;

import java.io.*;


public class WriteObjectFile{
	
    /// main Method
    public static void main(String[] args) throws Exception{

		//1. instance�� File�� ������ SinkStream :: FileOutputStream ����
		//2. instance�� �����ϴ� FilterStream :: ObjectOutputStream ����

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oos.writeObject(new UserVO(1,"ȫ�浿")); //==>API Ȯ��
		oos.writeObject(new UserVO(2,"ȫ���")); //==>API Ȯ��
		oos.flush();

		//Stream close()
		oos.close();

	}  //end of main
} // end of class
