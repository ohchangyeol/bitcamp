public class Developer2{
	// method(�Լ�) , field(��������) ����
	
	// field => Ư�� �Ӽ� ǥ��
	
	// instance�� Developer2�� �����Ѵٸ� ������ field�� ȣ��, ���� �Ҽ� �ִ�.
	
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100; // ����
	int projectCareer;  
	
	 
	//���� �ϰ�������� ������ praive�� �����ش�.
	/*
	private String name = "ȫ�浿";
	private String job = "������";
	private int avgIncome = 100; // ����
	private int projectCareer;  
	*/
	// System.out.println(projectCareer); // ���ͷ� ���� ���ǵ��� �ʰ� ȣ���� �Ѵٸ� ������ �߻�.

	//method ==> ��� ����

	// project�� �����Ͽ� �������� �� ��� ������ ��Ÿ���� method
	public void participateProject(){
		System.out.println("���α׷� ���߷� ���� ����, ��� ����");
		avgIncome++;
		projectCareer++;
	}
	// ====================�߰��� method (overLoading Method)==================
	public void participateProject(String project){
		System.out.println(project+" ==>  project ������ ���� ����, ��� ����");
		avgIncome++;
		projectCareer++;
	}

	// ���Ǹ� ���� ��������.
	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avgIncome++;
	}
	// ====================�߰��� method (overLoading Method)==================
	public void instruct(int lectureCount){
		System.out.println(lectureCount + "�� ���Ǹ� ���� ��������");
		avgIncome += lectureCount;
	}
	////////////////////////////�߰��� �κ� /////////////////////////////////
	
	public String getName() {
		System.out.println("getName() method");
		return name;
	}
	public String getJob() {
		System.out.println("getJob() method");
		return job;
	}
	public int getAvglncome () {
		System.out.println("getAvglncome() method");
		return avgIncome;
	}
	public int getProjectCareer () {
		System.out.println("getProjectCareer() method");
		return projectCareer;
	}
	
	/////////////////////////Developer2 �� Debeloper2Test ��ġ��
	// main Method
	public static void main(String[] args) {
	Developer2 developer = new Developer2(); // Instance

	/*
	System.out.println("�̸��� = " + developer.name);
	System.out.println("������ = " + developer.job);
	System.out.println("��ռ����� = " + developer.avgIncome);
	System.out.println("PJT ����� = " + developer.projectCareer);

	System.out.println("=========================");
	*/

	// method�� ȣ���Ͽ� ������ ���� ���°� �޾� ����ϸ�..?
	String name = developer.getName();
	String job = developer.getJob();
	int avgIncome = developer.getAvglncome(); 

	
	System.out.println("�̸��� = " + name);
	System.out.println("������ = " + job);
	System.out.println("��ռ����� = " + avgIncome);
	// �Ʒ� ���� ���ؤ���
	System.out.println("��ռ����� = " + developer.getProjectCareer());
	// �޼��尡 ȣ�� �Ǹ� �� �ȿ� �ִ� ���� return �޴´�.

	}
}
	