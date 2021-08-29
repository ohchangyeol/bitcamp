//package jp03.part06;

import java.io.*;


public class WriteObjectFile{
	
    /// main Method
    public static void main(String[] args) throws Exception{

		//1. instance를 File에 저장할 SinkStream :: FileOutputStream 생성
		//2. instance를 전송하는 FilterStream :: ObjectOutputStream 생성

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oos.writeObject(new UserVO(1,"홍길동")); //==>API 확인
		oos.writeObject(new UserVO(2,"홍길순")); //==>API 확인
		oos.flush();

		//Stream close()
		oos.close();

	}  //end of main
} // end of class
