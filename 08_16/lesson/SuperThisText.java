//SuperThisText

class JuniorHighSchool{
    //Field
    String name = "���ѹα����б�";
	int age= 1111;

    //Constructor
    public  JuniorHighSchool() {
    }

    //Meyhod
    public void schoolName() {
        System.out.println("���б� �̸� = "+name);
    }
}//end of class

class HighSchool extends JuniorHighSchool{
    //Field
    String name = "���ѹα�����б�";

    //Constructor
    public  HighSchool() {
    }
    public  HighSchool(String str) {
        name=str;
		int age= 100;
		System.out.println(age);
		System.out.println(this.age);
		
    }
    // �� �Ʒ� �ణ �ٸ� Ȯ����.
    // public  HighSchool(String name) {
    //     this.name = name;
    // }

    //Meyhod
    public void schoolName() {
        System.out.println("���б� �̸� = "+super.name);
        System.out.println("����б� �̸� = "+this.name);
        System.out.println("���б� �̸� = "+name);
    }
}//end of class

public class SuperThisText{
    //main
    public static void main(String[] args) {
        HighSchool hs01 = new HighSchool ();

        hs01.schoolName();

        System.out.println("=============");

        HighSchool hs02 = new HighSchool ("�������б�");
        hs02.schoolName();

    }
}
