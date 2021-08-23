public class Student extends Human{
    // Field 
    private int id;
    // Constrructor
    public Student(String name,int age, int id) {
        super(name,age);
        this.id = setId (id);
    }
    // Method
    public int setId(int id) {
        return this.id= id;
    }
    public void print() {
		super.print();
        System.out.print("\t학  번 : " + id);
		System.out.println();
    }
}