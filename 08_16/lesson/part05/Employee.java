public class Employee{
    // this(), super() method ����
    //Field
	String part;
    String name;
	int age;
    int baseSalary;

	// Constructor
	public Employee(){
		System.out.println("Emp�� class default Constructor");
	}
	public Employee(String name){
		System.out.println("Emp�� name �� �޴� Constructor");
		this.name = name;
	}
    public Employee(String name,String part){
        this(name);
		this.part = part;
		System.out.println("Emp�� name,part �� �޴� Constructor");
	}
    public Employee(String name,String part, int age){
        this(name,part);
		this.age = age;
		System.out.println("Emp�� name,part,age �� �޴� Constructor");
	}
    //Method
    public int salary(){
        System.out.println("Emp�� salary() method");
        baseSalary = 100;
        return baseSalary;
    }
}