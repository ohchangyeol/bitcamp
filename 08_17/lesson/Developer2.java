public class Developer2{
	// method(함수) , field(전역변수) 수업
	
	// field => 특성 속성 표현
	
	// instance로 Developer2을 접근한다면 공개된 field를 호출, 접근 할수 있다.
	
	String name = "홍길동";
	String job = "개발자";
	int avgIncome = 100; // 수입
	int projectCareer;  
	
	 
	//공개 하고싶지않은 정보를 praive로 막아준다.
	/*
	private String name = "홍길동";
	private String job = "개발자";
	private int avgIncome = 100; // 수입
	private int projectCareer;  
	*/
	// System.out.println(projectCareer); // 리터럴 값이 정의되지 않고 호출을 한다면 에러가 발생.

	//method ==> 기능 행위

	// project에 참여하여 수입증가 및 경력 쌓음을 나타내는 method
	public void participateProject(){
		System.out.println("프로그램 개발로 수입 증가, 경력 쌓음");
		avgIncome++;
		projectCareer++;
	}
	// ====================추가된 method (overLoading Method)==================
	public void participateProject(String project){
		System.out.println(project+" ==>  project 참여로 수입 증가, 경력 쌓음");
		avgIncome++;
		projectCareer++;
	}

	// 강의를 통해 수입증가.
	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avgIncome++;
	}
	// ====================추가된 method (overLoading Method)==================
	public void instruct(int lectureCount){
		System.out.println(lectureCount + "개 강의를 통한 수입증가");
		avgIncome += lectureCount;
	}
	////////////////////////////추가된 부분 /////////////////////////////////
	
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
	
	/////////////////////////Developer2 와 Debeloper2Test 합치기
	// main Method
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

	}
}
	