public class Developer{
// method(�Լ�) , field(��������) ����

	/*
			���� Ȱ����, ������ �����ϴ� object Modeling
			1. ȫ�浿�� ���ȭ �����Ѱ� attribute ==>Field
			2. ������ �����ϴ� ����    behavior ==> Method
			�̸� java language�� ����
	*/
	// field => Ư�� �Ӽ� ǥ��
	String name = "ȫ�浿";
	String job = "������";
	int avglncome = 100; // ����
	int projectCareer;  //int�� �ʱ�ȭ ����0 ;
	// System.out.println(projectCareer); // ���ͷ� ���� ���ǵ��� �ʰ� ȣ���� �Ѵٸ� ������ �߻�.

	//method ==> ��� ����
	public void participateProject(){
		System.out.println("���α׷� ���߷� ���� ����, ��� ����");
		avglncome++;
		projectCareer++;
	}
	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avglncome++;
	}
}
