public class Human{
	//�߻�ȭ ������ ����, �Ϲ����� ������ �𵨸�.
	//Field
	String name;
	int age;

	// Constructor
	public Human(){
		System.out.println("Human class default Constructor");
	}
	public Human(String str){
		System.out.println("Human class name �� �޴� Constructor");
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