public class Developer1Test{
	// Main
	public static void main(String[] args) {
		Developer1 developer = new Developer1(); // Instance

		System.out.println("�̸��� = " + developer.name);
		System.out.println("������ = " + developer.job);
		System.out.println("��ռ����� = " + developer.avglncome);
		System.out.println("PJT ����� = " + developer.projectCareer);

		System.out.println("=========================");

		//project ����
		developer.participateProject();
		System.out.println("��ռ����� = " + developer.avglncome);
		System.out.println("project ���� ����� = " + developer.projectCareer);
		
		System.out.println("=========================");

		//1�� ������ ����
		developer.instruct();
		System.out.println("��ռ����� = " + developer.avglncome);

		/////////////////////////////////�߰��� �κ�///////////////////////////////////

		System.out.println("=========================");

		//String projectName = "�ѹ�����";
		//developer.participateProject(projectName);
		//���� �� ������ �Ʒ��� ���� ǥ��.
		developer.participateProject("�ѹ�����");// ���ڰ��� Ȱ��
		System.out.println("��ռ����� = " + developer.avglncome);
		System.out.println("project ���� ����� = " + developer.projectCareer);

		System.out.println("=========================");

		// ȫ�浿�� 2�� ������ ����
		//int lectureCount= 2;
		//developer.instruct(lectureCount);
		//���� �� ������ �Ʒ��� ���� ǥ��.
		developer.instruct(2);
		System.out.println("��ռ����� = " + developer.avglncome);

	}// end of main

}//end of class
