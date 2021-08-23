public class Son extends Iam{ 
    // Iam의 구체화, 상속
    //field
    String school;

    //Constructor
    public Son() {
        System.out.println("Son class default Constructor");
    }

    //method
	//setter method
	public void setSchool(String str) {
		school = str;
	}
	//getter method
	public String getSchool() {
		return school;
	}

    public static void main(String[] args) {
        Son son = new Son ();
        
        son.setName("홍길동아들"); //human 까지 올라감.
        son.setAge(50);
        son.setJob("개발자준비중"); //iam
        son.setSchool("아이티교육센터"); //son
        
        System.out.println("이름 = "+son.getName()); // human
        System.out.println("나이 = "+son.getAge());  // Human
        System.out.println("직업 = "+son.getJob());  // Iam
        System.out.println("학교 = "+son.getSchool());  // Iam
    }
}