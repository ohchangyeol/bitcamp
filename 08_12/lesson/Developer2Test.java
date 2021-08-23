public class Developer2Test{
	// Main
	public static void main(String[] args) {
		Developer2 developer = new Developer2(); // Instance

		/*
		System.out.println("이름은 = " + developer.name);
		System.out.println("직업은 = " + developer.job);
		System.out.println("평균수입은 = " + developer.avgIncome);
		System.out.println("PJT 경력은 = " + developer.projectCareer);

		System.out.println("=========================");
		*/

		// method를 호출하여 행위를 통해 상태값 받아 출력하면..?
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvglncome(); 

		
		System.out.println("이름은 = " + name);
		System.out.println("직업은 = " + job);
		System.out.println("평균수입은 = " + avgIncome);
		// 아래 내용 이해ㄱㄱ
		System.out.println("평균수입은 = " + developer.getProjectCareer());
		// 메서드가 호출 되면 그 안에 있는 값을 return 받는다.

	}// end of main

}//end of class