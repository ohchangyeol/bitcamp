package shop.service.user;

public class Client {
	
	private String name;
	int age ;
	protected String address;
	public boolean gender;
	public static final String mattionality = "´ëÇÑ¹Î±¹";

	
	public Client() {
	}


	public Client(String name, int age, String add, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = add;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public static String getMattionality() {
		return mattionality;
	}


	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + "]";
	}

}
