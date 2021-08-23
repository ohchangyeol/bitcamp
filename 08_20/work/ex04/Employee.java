public class Employee extends Human{
    // Field 
    private String dept;
    // Constrructor
    public Employee(String name,int age, String dept) {
        super(name,age);
        this.dept = setDept(dept);
    }
    // Method
    public String setDept(String dept) {
        return this.dept= dept;
    }
    public void print() {
		super.print();
        System.out.print("\t부  서 : " + dept);
		System.out.println();
    }
}