public class Developer1Test{
	// Main
	public static void main(String[] args) {
		Developer1 developer = new Developer1(); // Instance

		System.out.println("이름은 = " + developer.name);
		System.out.println("직업은 = " + developer.job);
		System.out.println("평균수입은 = " + developer.avglncome);
		System.out.println("PJT 경력은 = " + developer.projectCareer);

		System.out.println("=========================");

		//project 참여
		developer.participateProject();
		System.out.println("평균수입은 = " + developer.avglncome);
		System.out.println("project 참여 경력은 = " + developer.projectCareer);
		
		System.out.println("=========================");

		//1개 과목을 강의
		developer.instruct();
		System.out.println("평균수입은 = " + developer.avglncome);

		/////////////////////////////////추가된 부분///////////////////////////////////

		System.out.println("=========================");

		//String projectName = "한미은행";
		//developer.participateProject(projectName);
		//위의 두 라인을 아래와 같이 표현.
		developer.participateProject("한미은행");// 인자값의 활용
		System.out.println("평균수입은 = " + developer.avglncome);
		System.out.println("project 참여 경력은 = " + developer.projectCareer);

		System.out.println("=========================");

		// 홍길동이 2개 과목을 강의
		//int lectureCount= 2;
		//developer.instruct(lectureCount);
		//위의 두 라인을 아래와 같이 표현.
		developer.instruct(2);
		System.out.println("평균수입은 = " + developer.avglncome);

	}// end of main

}//end of class
