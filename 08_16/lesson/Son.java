public class Son extends Iam{ 
    // Iam�� ��üȭ, ���
    //field
    String school;

    //Constructor
    public Son() {
        System.out.println("Son class default Constructor");
    }

    //method
	//setter method
	public void setSchool(String str) {
		school = str;
	}
	//getter method
	public String getSchool() {
		return school;
	}

    public static void main(String[] args) {
        Son son = new Son ();
        
        son.setName("ȫ�浿�Ƶ�"); //human ���� �ö�.
        son.setAge(50);
        son.setJob("�������غ���"); //iam
        son.setSchool("����Ƽ��������"); //son
        
        System.out.println("�̸� = "+son.getName()); // human
        System.out.println("���� = "+son.getAge());  // Human
        System.out.println("���� = "+son.getJob());  // Iam
        System.out.println("�б� = "+son.getSchool());  // Iam
    }
}