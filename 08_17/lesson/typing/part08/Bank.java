
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
    // 은행명 출력하는 display method를 추상 method로 정의
    public abstract void display();
    
    public String GetName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}