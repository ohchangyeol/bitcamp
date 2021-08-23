public class Other{
	//Field
    String name ="홍길동";
	String job = new String("개발자");

    Father owner = new Father();
	// Constructor
    public Other(){
        System.out.println(this.owner.name);    //public String name= "홍길동"; 
        System.out.println(owner.bank);         //protected String bank = "한양은행"
        System.out.println(owner.branch);       //String branch = "역삼동지점";
        // System.out.println(f.password);      //private int password = 1234; 

        System.out.println("은행 비밀번호 = "+this.owner.getPassword(0));
    }


}