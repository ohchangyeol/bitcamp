public class Developer{
// method(함수) , field(전역변수) 수업

	/*
			강의 활동과, 개발을 병행하는 object Modeling
			1. 홍길동의 명사화 가능한것 attribute ==>Field
			2. 행위에 대항하는 사항    behavior ==> Method
			이를 java language로 구현
	*/
	// field => 특성 속성 표현
	String name = "홍길동";
	String job = "개발자";
	int avglncome = 100; // 수입
	int projectCareer;  //int는 초기화 값이0 ;
	// System.out.println(projectCareer); // 리터럴 값이 정의되지 않고 호출을 한다면 에러가 발생.

	//method ==> 기능 행위
	public void participateProject(){
		System.out.println("프로그램 개발로 수입 증가, 경력 쌓음");
		avglncome++;
		projectCareer++;
	}
	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avglncome++;
	}
}
