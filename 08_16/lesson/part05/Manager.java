public class Manager extends Employee{
    
    //Field
    int salary;

	// Constructor
    public Manager(){
		System.out.println("Manager의 class default Constructor");
	}
	public Manager(String name){
		super(name);
        System.out.println("Manager의 name 을 받는 Constructor");
	}
    public Manager(String name,String part){
        this(name);
		this.part = part;
		System.out.println("Manager의 name,part 을 받는 Constructor");
	}
    public Manager(String name,String part, int age){
        super(name,part);
		this.age = age;
		System.out.println("Manager의 name,part,age 을 받는 Constructor");
	}
    public Manager(String name,String part, int age,int salary){
        this(name,part,age);
		this.salary = salary;
		System.out.println("Manager의 name,part,age,salary을 받는 Constructor");
	}
    //Method
    public int salary(){
        System.out.println("Manager의 overloading salary method");
        baseSalary = 200;
        return baseSalary;
    }
    public void callSalary(){
        System.out.println("Employee의 기본급은 = "+super.salary());
        System.out.println("Manager의 기본급은 1 = "+this.salary());
        System.out.println("Manager의 기본급은 2 = "+salary());
    }
    //main
    public static void main(String[] args) {
        Manager m1 = new Manager("홍길동","EJB",25,300);
        /*
        Manager m2 = new Manager("홍길동","EJB");
        Manager m3 = new Manager("홍길동","EJB",25);
        Manager m4 = new Manager("홍길동","EJB",25,300);
        
        System.out.println("\n");
        */
        System.out.println("overriding된 salary 호출 = " + m1.salary());
        //System.out.println();
		m1.callSalary();
        
    }
}