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
        System.out.println("���� ��� �ȳ�");
    }
    // ==> ������ �ʰ� ����Ŭ������ overRiding �� ������ �߻��ϴ� �޼��� ����
    // public void charge() {
    //     System.out.println("�л� : 300, �Ϲ��� : 500, ��� : ��¥");
    // }
    public abstract void charge() {
    }
}// end of class

class Student extends BusCharge{
    public Student() {
        super("�л�");
    }
    public void charge() {
        System.out.println(" :: 300�� \n");
    }
}// end of class

class Adult extends BusCharge{
    public Adult() {
        super("�Ϲ���");
    }
    public void charge() {
        System.out.println(" :: 500�� \n");
    }
}// end of class

class Old extends BusCharge{
    public Old() {
        super("�Ϲ���");
    }
    public void charge() {
        System.out.println(" :: ��¥\n");
    }
}// end of class
public class Display{
    //main
    public static void main(String[] args) {
        BusCharge bc1 = new Student ();      //Student b1 = new Student ();
        BusCharge bc2 = new Adult ();        //Adult b2 = new Adult ();
        BusCharge bc3 = new Old ();          //Old b3 = new Old ();

        b1.information(); // BusCharge class �ȿ� information ȣ��. 
        System.out.print(bc1.section); 
        b1.charge(); //� Ŭ������ Method ȣ��Ǿ����� Ȯ��==> b1=Student Student�ȿ� �ִ� charge�� ����

        b2.information();
        System.out.print(bc2.section);
        b2.charge(); //� Ŭ������ Method ȣ��Ǿ����� Ȯ��==> b1=Adult Adult�ȿ� �ִ� charge�� ����
        
        b3.information();
        System.out.print(bc3.section);
        b3.charge(); //� Ŭ������ Method ȣ��Ǿ����� Ȯ��==> b1=Old Old�ȿ� �ִ� charge�� ����

        // �� �ڵ��� �Ʒ� �ڵ� �� 
        // �ݺ��� �κ��� ������
        // ���� data type ���� (�迭)�� �̿��Ͽ� �ϰ������� ������ �� �ִ°�

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