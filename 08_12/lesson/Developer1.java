public class Developer1{
	// method(함수) , field(전역변수) 수업
	
		// field => 특성 속성 표현
		String name = "홍길동";
		String job = "개발자";
		int avglncome = 100; // 수입
		int projectCareer;  
		// System.out.println(projectCareer); // 리터럴 값이 정의되지 않고 호출을 한다면 에러가 발생.
	
		//method ==> 기능 행위
		public void participateProject(){
			System.out.println("프로그램 개발로 수입 증가, 경력 쌓음");
			avglncome++;
			projectCareer++;
		}
		// ====================추가된 method (overLoading Method)==================
		public void participateProject(String project){// 인자값의 활용
			System.out.println(project+" ==>  project 참여로 수입 증가, 경력 쌓음");
			avglncome++;
			projectCareer++;
		}




		public void instruct(){
			System.out.println("강의를 통한 수입증가");
			avglncome++;
		}
		// ====================추가된 method (overLoading Method)==================
		public void instruct(int lectureCount){// 인자값의 활용
			System.out.println(lectureCount + "개 강의를 통한 수입증가");
			avglncome += lectureCount;
		}
	}
	