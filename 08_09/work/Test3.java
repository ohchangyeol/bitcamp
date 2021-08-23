// FileName : Test3.java

public class Test3 {
    public static void main(String args []) {
        int i = Integer.parseInt(args[0]);// 아구먼트를 받아 스트링 데이터타입을 인티저로 바꿔준다.
        int j = Integer.parseInt(args[1]);
        
		//먼저 홀수 짝수 나누기
        //6,9,12 는 2,3의 공배수
        //i - 짝수
        if (i % 2 == 0) { //나머지 연산자를 통해 0 이 남으면 if가 수행.
            if ( i % 3 == 0){ //나머지 연산자를 통해 0이 되면 3의 배수 
                System.out.println("입력하신 1번째 인자값"+i+"는 짝수이며 3의배수입니다.");   
            }else{
                System.out.println("입력하신 1번째 인자값"+i+"는 짝수이며 3의배수가 아닙니다.");   
            } 
        }else{ // i - 홀수
            if ( i % 3 == 0){
                System.out.println("입력하신 1번째 인자값"+i+"는 홀수이며 3의배수입니다.");   
            }else{
                System.out.println("입력하신 1번째 인자값"+i+"는 홀수이며 3의배수가 아닙니다.");   
            }
        }

        //j - i도 짝수 홀수 나눈다면 j도 짝수 홀수 나눠주기
        if (j % 2 == 0) { 
            if ( j % 3 == 0){
                System.out.println("입력하신 2번째 인자값"+j+"는 짝수이며 3의배수입니다.");   
            }else{
                System.out.println("입력하신 2번째 인자값"+j+"는 짝수이며 3의배수가 아닙니다.");   
            } 
        }else{ 
            if ( j % 3 == 0){
                System.out.println("입력하신 2번째 인자값"+j+"는 홀수이며 3의배수입니다.");   
            }else{
                System.out.println("입력하신 2번째 인자값"+j+"는 홀수이며 3의배수가 아닙니다.");   
            }
        }
		
    }	
}
