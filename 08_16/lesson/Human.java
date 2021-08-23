public class Human{
	//추상화 수준이 높은, 일반적인 사항을 모델링.
	//Field
	String name;
	int age;

	// Constructor
	public Human(){
		System.out.println("Human class default Constructor");
	}
	public Human(String str){
		System.out.println("Human class name 을 받는 Constructor");
		name = str;
	}

	//method
	//setter method
	public void setName(String str) {
		name = str;
	}
	public void setAge (int b) {
		age = b;
	}	

	//getter method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}// end of class