
/**
 * Bank
 */
public abstract class Bank {
    //Field
    private String name;

    //Contstructor
    public Bank(){
    }
    public Bank(String name){
        this.name = name;
    }

    //Method
    // ����� ����ϴ� display method�� �߻� method�� ����
    public abstract void display();
    
    public String GetName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}