abstract class BusCharge{
    //Field
    String section;
    
    //Constructor
    public BusCharge() {
    }
    public BusCharge(String section) {
        this.section = section ;
    }
    //method
    public void information() {
        System.out.println("버스 요금 안내");
    }
    // ==> 사용되지 않고 하위클레스에 overRiding 을 강제로 추상하는 메서드 정의
    // public void charge() {
    //     System.out.println("학생 : 300, 일반인 : 500, 어르신 : 공짜");
    // }
    public abstract void charge() {
    }
}// end of class

class Student extends BusCharge{
    public Student() {
        super("학생");
    }
    public void charge() {
        System.out.println(" :: 300원 \n");
    }
}// end of class

class Adult extends BusCharge{
    public Adult() {
        super("일반인");
    }
    public void charge() {
        System.out.println(" :: 500원 \n");
    }
}// end of class

class Old extends BusCharge{
    public Old() {
        super("일반인");
    }
    public void charge() {
        System.out.println(" :: 공짜\n");
    }
}// end of class
public class Display{
    //main
    public static void main(String[] args) {
        BusCharge bc1 = new Student ();      //Student b1 = new Student ();
        BusCharge bc2 = new Adult ();        //Adult b2 = new Adult ();
        BusCharge bc3 = new Old ();          //Old b3 = new Old ();

        b1.information(); // BusCharge class 안에 information 호출. 
        System.out.print(bc1.section); 
        b1.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Student Student안에 있는 charge를 실행

        b2.information();
        System.out.print(bc2.section);
        b2.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Adult Adult안에 있는 charge를 실행
        
        b3.information();
        System.out.print(bc3.section);
        b3.charge(); //어떤 클래스의 Method 호출되었는지 확인==> b1=Old Old안에 있는 charge를 실행

        // 위 코딩과 아래 코딩 비교 
        // 반복된 부분은 없는지
        // 같은 data type 묶음 (배열)을 이용하여 일괄적으로 관리할 수 있는가

        BusCharge[] bc = new BusCharge[3];
        bc[0] = new Student ();     //BusCharge bc1 = new Student (); //Student b1 = new Student ();
        bc[1] = new Adult ();       //BusCharge bc2 = new Adult ();   //Adult b2 = new Adult (); 
        bc[2] = new Old ();         //usCharge bc3 = new Old ();     //Old b3 = new Old ();

        for(int i = 0 ; bc.length ; i++){
            bc[i].information();
            System.out.print(bc[i].section);
            bc[i].charge();
        }
    }
}