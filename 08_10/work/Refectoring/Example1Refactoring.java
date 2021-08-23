public class Example1Refactoring { 
    public static void main(String[] args) { 
		//args의 유무 확인
		if(args.length != 1 ){
			System.out.println("args를 입력하거나, 1개 이상 초과했네?");
			return;
		}
		// 값이 있다면 Data를 변수지정.
        int inputData = Integer.parseInt(args[0]);
		String value = "수";
		//inputData의 값에 대한 유효성 확인.
		if (inputData < 0 || inputData > 100){
			System.out.println("미안. 너의 값이 0~100의 범위가 아니야");
			return;
		}
		switch (inputData/10) { 
			case 10:break;
			case 9: break;
			case 8: 
				value="우"; //케이스 8의 실행문이 수행되어 전역변수인 value 의 값을 "우"로 변경.
				break; 
			case 7: 
				value="미";
				break; 
			case 6: 
				value="양"; 
				break; 
			default : value="가"; // 그이하 값
		}
		System.out.println("입력하신 값 "+inputData+ "점은 " +value+"입니다.");
    }// end of main
}//end of class
