public class Employee{
    // this(), super() method 이해
    //Field
	String part;
    String name;
	int age;
    int baseSalary;

	// Constructor
	public Employee(){
		System.out.println("Emp의 class default Constructor");
	}
	public Employee(String name){
		System.out.println("Emp의 name 을 받는 Constructor");
		this.name = name;
	}
    public Employee(String name,String part){
        this(name);
		this.part = part;
		System.out.println("Emp의 name,part 을 받는 Constructor");
	}
    public Employee(String name,String part, int age){
        this(name,part);
		this.age = age;
		System.out.println("Emp의 name,part,age 을 받는 Constructor");
	}
    //Method
    public int salary(){
        System.out.println("Emp의 salary() method");
        baseSalary = 100;
        return baseSalary;
    }
}