public class Iam extends Human{ 
    // Human의 구체화, 상속
    //field
    String job;

    //Constructor
    public Iam() {
        System.out.println("Iam class default Constructor");
    }

    //method
	//setter method
	public void setJob(String str) {
		job = str;
	}
	//getter method
	public String getJob() {
		return job;
	}

    public static void main(String[] args) {
        Iam iam = new Iam(); //instance 변수생성
        
        iam.setName("홍길동"); // set name 의 값 재정의.
		iam.setAge(100);	// set age 의 값 재정의.
        iam.setJob("개발자");	// set job 의 값 재정의.
        
		
        System.out.println("이름 = "+iam.getName()); // return 호출.
        System.out.println("나이 = "+iam.getAge());  // return 호출.
        System.out.println("직업 = "+iam.getJob());  // return 호출.
        
    }
}