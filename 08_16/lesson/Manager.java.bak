public class Manager extends Employee{
    // this(), super() method 이해

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
		super.part = part;
		System.out.println("Manager의 name,part 을 받는 Constructor");
	}
    public Manager(String name,String part, int age){
        super(name,part);
		super.age = age;
		System.out.println("Manager의 name,part,age 을 받는 Constructor");
	}
    public Manager(String name,String part, int age,int salary){
        this(name,part,age);
		this.salary = salary;
		System.out.println("Manager의 name,part,age,salary을 받는 Constructor");
	}
    //Method
    public void callSalary(){
        System.out.println("Manager의 기본급은 = "+salary());
    }
	//Method Overloading
	public int salary(){
        System.out.println("Emp의 salary() method");
        baseSalary = 200;
        return baseSalary;
    }
    //main
    public static void main(String[] args) {
        //Manager m1 = new Manager("홍길동"); 
		//================> Emp의 name -> Manager의 name
        
        //Manager m2 = new Manager("홍길동","EJB");
		//===> Emp의 name -> Manager의 name ->Manager의 name,part
		
        //Manager m3 = new Manager("홍길동","EJB",25);
		// Emp의 name -> Emp의 name,part -> "Manager의 name,part,age 
		
        Manager m4 = new Manager("홍길동","EJB",25,300);
        //Emp의 name -> Emp의 name,part -> Manager의 name,part,age ->Manager의 name,part,age,salary
		
        System.out.println("\n");
        
        //System.out.println("overriding된 salary 호출 = "+m4.salary());
        System.out.println("기존에 있는 salary 호출 = "+ m4.salary());
    }
}