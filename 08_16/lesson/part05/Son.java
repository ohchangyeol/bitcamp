public class Son extends Father{
    // Field
	
    // Constructor
    public Son(){
        System.out.println(this.name);      //public String name= "홍길동"; 
        System.out.println(bank);           //protected String bank = "한양은행"
        System.out.println(branch);         //String branch = "역삼동지점";
        // System.out.println(password);    //private int password = 1234;

        // -->field(상태정보)는 method(행위)를 이용 접근
        System.out.println("은행 비밀번호 = "+this.getPassword(0));

    }

}// class

