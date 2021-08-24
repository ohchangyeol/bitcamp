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
    public abstract void charge();
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
        Student b1 = new Student ();
        Adult b2 = new Adult ();
        Old b3 = new Old ();

        b1.information(); // BusCharge class �ȿ� information ȣ��. 
        System.out.print(b1.section); 
        b1.charge(); //� Ŭ������ Method ȣ��Ǿ����� Ȯ��==> b1=Student Student�ȿ� �ִ� charge�� ����

        b2.information();
        System.out.print(b2.section);
        b2.charge(); //� Ŭ������ Method ȣ��Ǿ����� Ȯ��==> b1=Adult Adult�ȿ� �ִ� charge�� ����
        
        b3.information();
        System.out.print(b3.section);
        b3.charge(); //� Ŭ������ Method ȣ��Ǿ����� Ȯ��==> b1=Old Old�ȿ� �ִ� charge�� ����
        
        // abstract class �� ��ü���� �Ұ�.
        // BusCharge bc1 = new BusCharge();
        //��ü������ �Ұ��ϳ� , ������ ���� data Type�� ����.
        // BusCharge bc02;

    }
}