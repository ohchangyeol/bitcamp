public class Developer2Test{
	// Main
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

	}// end of main

}//end of class