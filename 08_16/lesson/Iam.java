public class Iam extends Human{ 
    // Human�� ��üȭ, ���
    //field
    String job;

    //Constructor
    public Iam() {
        System.out.println("Iam class default Constructor");
    }

    //method
	//setter method
	public void setJob(String str) {
		job = str;
	}
	//getter method
	public String getJob() {
		return job;
	}

    public static void main(String[] args) {
        Iam iam = new Iam(); //instance ��������
        
        iam.setName("ȫ�浿"); // set name �� �� ������.
		iam.setAge(100);	// set age �� �� ������.
        iam.setJob("������");	// set job �� �� ������.
        
		
        System.out.println("�̸� = "+iam.getName()); // return ȣ��.
        System.out.println("���� = "+iam.getAge());  // return ȣ��.
        System.out.println("���� = "+iam.getJob());  // return ȣ��.
        
    }
}