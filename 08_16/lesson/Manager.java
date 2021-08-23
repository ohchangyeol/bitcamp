public class Manager extends Employee{
    // this(), super() method ����

    //Field
    int salary;

	// Constructor
    public Manager(){
		System.out.println("Manager�� class default Constructor");
	}
	public Manager(String name){
		super(name);
        System.out.println("Manager�� name �� �޴� Constructor");
	}
    public Manager(String name,String part){
        this(name);
		super.part = part;
		System.out.println("Manager�� name,part �� �޴� Constructor");
	}
    public Manager(String name,String part, int age){
        super(name,part);
		super.age = age;
		System.out.println("Manager�� name,part,age �� �޴� Constructor");
	}
    public Manager(String name,String part, int age,int salary){
        this(name,part,age);
		this.salary = salary;
		System.out.println("Manager�� name,part,age,salary�� �޴� Constructor");
	}
    //Method
    public void callSalary(){
        System.out.println("Manager�� �⺻���� = "+salary());
    }
	//Method Overloading
	public int salary(){
        System.out.println("Emp�� salary() method");
        baseSalary = 200;
        return baseSalary;
    }
    //main
    public static void main(String[] args) {
        //Manager m1 = new Manager("ȫ�浿"); 
		//================> Emp�� name -> Manager�� name
        
        //Manager m2 = new Manager("ȫ�浿","EJB");
		//===> Emp�� name -> Manager�� name ->Manager�� name,part
		
        //Manager m3 = new Manager("ȫ�浿","EJB",25);
		// Emp�� name -> Emp�� name,part -> "Manager�� name,part,age 
		
        Manager m4 = new Manager("ȫ�浿","EJB",25,300);
        //Emp�� name -> Emp�� name,part -> Manager�� name,part,age ->Manager�� name,part,age,salary
		
        System.out.println("\n");
        
        //System.out.println("overriding�� salary ȣ�� = "+m4.salary());
        System.out.println("������ �ִ� salary ȣ�� = "+ m4.salary());
    }
}