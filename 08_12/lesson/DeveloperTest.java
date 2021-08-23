public class DeveloperTest {

	/*
		Developer.class Instance 생성, 사용하는 class 정의 : application class
	*/

	//field
	//method

	//main
	public static void main(String[] args){

		Developer developer = new Developer(); // instance
		//console
		// developer 식별성을 갖는 Intance .연산자를 통해 사용.
		System.out.println("이름 = " + developer.name);
		System.out.println("직업 = " + developer.job);
		System.out.println("평균수입은 = " + developer.avglncome);
		System.out.println("JPT = " + developer.projectCareer);

		System.out.println("==================");

		developer.participateProject();// developer안에 participateProject 메서드 호출.
		System.out.println("평균수입은 = " + developer.avglncome);
		System.out.println("JPT = " + developer.projectCareer);

		System.out.println("==================");

		developer.instruct();
		System.out.println("평균수입은 = " + developer.avglncome);

	}//end of main

}//end of class
