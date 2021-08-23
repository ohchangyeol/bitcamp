package jb04.part07.outer;

public class Other1{
	//Field
    jb04.part07.Father unknown = new  jb04.part07.Father();     //==> father 인스턴스생성
	// Constructor
    public Other1(){
        System.out.println(this.unknown.name);    //public String name= "홍길동"; 
        // System.out.println(f.bank);         //protected String bank = "한양은행"
        // System.out.println(f.branch);       //String branch = "역삼동지점";
        // System.out.println(f.password);      //private int password = 1234; 

        System.out.println(this.unknown.getBranch());
        System.out.println(unknown.getPassword(0));
    }


}