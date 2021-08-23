package jb1.part02;

/*
  FileName : Hello.java
*/
public class Hello{
  //==> 1줄 주석 : 컴파일시 주석문은 컴파일시 제외
  // java 실행에 필요한 method : main method
  
  public static void main ( String[] args ){
    System.out.println("Hello Java");
  }//end of main
}//end of class

/*
<<주의사항 및 약속사항>>
	1. class name과 file name은 동일해야 한다.
	   예) public class Hello 면 Hello.java (File Name)
	2. 대소문자를 구별
	3. 실행시 public static void main ( String[] args ) 필요
	4. System.out.println(~~~); ==>~~~ Console출력
	5. Hello.java 컴파일 후 Hello.class(ByteCode)생성확인

<<Console(DOS화면)에서 conpile & run>>	
	1.File save 
	  -FileName : Hello.java ==>FileName과 ClassName은 동일
	
	2.Compile
	  1)file저장 directory 로 이동 후 compile ==> javac 확장자 포함 FileName
	    c:\work>javac. Hello.java
	  2)classFile 생성 확인 ==> byte code 생성 확인(hello.class)
	   c:\work>dir

	3.실행
	  3)run ==> java 확장자를 제외한 FileName
	  c:\work>java Hello
	<<EditPlus 환경설정 : 컴파일 , 실행 등록하기>>
	==>문서/영구적 설정에서 등록할 수 있음
*/

