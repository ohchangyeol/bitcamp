public class Example1 { 
    public static void main(String[] args) { 
        int inputData = Integer.parseInt(args[0]);
		String value = "수"; // 초기 설정.
		// 유효성 먼저 확인
		/*
        if (inputData >= 0 && inputData <= 100 ){ // 입력값이 0~ 100 상이 조건-> inputData가 0 같거나 크면 참, 그리고 inputData보다 100이 크거나 같으면 참. 두 조건이 같으면 실행문으로.
			//System.out.println(inputData/10); 인티저 값은 실수를 버린다.
		//if (inputData > 100 || inputData < 0){
			switch (inputData/10) { 
            	case 10: 
            		break;
            	case 9: 
            		break; 
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
			
			가독성이 안좋고 반복되는게 많음.

			if (inputData >= 90){ // 전달받은 인자가 90보다 같거나 크면 실행
				System.out.println("입력하신 값 "+inputData+ "점은 " +value+"입니다.");
			}else if (inputData >= 80 && inputData < 90){
				value="우";
				System.out.println("입력하신 값 "+inputData+ "점은 " +value+"입니다.");
			}else if (inputData >= 70 && inputData < 80){
				value="미";
				System.out.println("입력하신 값 "+inputData+ "점은 " +value+"입니다.");
			}else if (inputData >= 60 && inputData < 70){
				value="양";
				System.out.println("입력하신 값 "+inputData+ "점은 " +value+"입니다.");
			}else{
				value="가";
				System.out.println("입력하신 값 "+inputData+ "점은 " +value+"입니다.");
			}
			
            
        }else {
            System.out.println("0 ~ 100 사이의 값이 아닙니다.");
        }
		*/
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
    }
}
