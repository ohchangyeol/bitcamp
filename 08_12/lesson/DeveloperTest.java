public class DeveloperTest {

	/*
		Developer.class Instance ����, ����ϴ� class ���� : application class
	*/

	//field
	//method

	//main
	public static void main(String[] args){

		Developer developer = new Developer(); // instance
		//console
		// developer �ĺ����� ���� Intance .�����ڸ� ���� ���.
		System.out.println("�̸� = " + developer.name);
		System.out.println("���� = " + developer.job);
		System.out.println("��ռ����� = " + developer.avglncome);
		System.out.println("JPT = " + developer.projectCareer);

		System.out.println("==================");

		developer.participateProject();// developer�ȿ� participateProject �޼��� ȣ��.
		System.out.println("��ռ����� = " + developer.avglncome);
		System.out.println("JPT = " + developer.projectCareer);

		System.out.println("==================");

		developer.instruct();
		System.out.println("��ռ����� = " + developer.avglncome);

	}//end of main

}//end of class
