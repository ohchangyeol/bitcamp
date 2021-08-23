// FileName : Test2.java

public class Test2 {
    public static void main(String args []) {
        int i = Integer.parseInt(args[0]); // 아구먼트를 받아 스트링 데이터타입을 인티저로 바꿔준다.
        int j = Integer.parseInt(args[1]);
        //int sum; // i와 j를 합치거나 뺄 총합을 담을 변수생성. error ->
		int sum=0;
        if(i>j){ //i가 j보다 클때 
            sum = i-j; //지역변수에 i와 j의 뺀 값을 대입.
			//System.out.println(sum);
            System.out.println("첫번째 인수 :"+i+ ", 두번째 인수 : "+j+",\t"+i+" - "+j+" = "+ sum); //출력
			
		}else if(i<j){// else를 쓰기엔 ==가 있을 수도 있기 때문에 else if 활용.
            sum = i+j;
            System.out.println("첫번째 인수 :"+i+ ", 두번째 인수 : "+j+",\t"+i+" + "+j+" = "+sum);
        }else{ 
			System.out.println("첫번째 인수 :"+i+ ", 두번째 인수 : "+j+", \t 첫번째 인수와 두번째 인수의 값이 같습니다.");
		}
    }
}
