package jb04.part07.outer;

public class Son1 extends jb04.part07.father{
    // Field
	
    // Constructor
    public Son1(){
        System.out.println(this.name);      //public String name= "홍길동"; 
        System.out.println(bank);           //protected String bank = "한양은행"
        System.out.println(branch);         //String branch = "역삼동지점";
        // System.out.println(password);    //private int password = 1234;

        // -->Field(상태정보)는 method(행위)를 이용 접근
        System.out.println(this.getBranch());
        System.out.println(getPassword(0));

    }

}// class

