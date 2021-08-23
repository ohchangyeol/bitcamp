public class Prob02{
	public static void main(String args[]){
		//System.out.println("hello");
		int limit = 50;
		/*
		//count를 활용한 소수 구하기. 2,3,5,7,11 ....41,43,47
		//int count = 0; //여기 없어도 됨
		for (int i = 2 ; i < limit ; i++ ){
			//추가
			int count = 0;
			for (int j= 2 ;j < limit ;j++ ){
				if (i % j == 0){
					count ++;
				}
			}
			if (count == 1){
				System.out.println(i);
			}
			//count= 0; //초기화가 필요없음
		}
		*/
		
		// boolean 을 사용한 소수 구하기.
		
		System.out.println("========================");
		boolean prime = false;
		for (int i = 2;i < limit ;i++ ){
			prime = true;
			for (int j = 2 ; j < limit; j++){
				if (i % j == 0){
					prime = false;
				}		
				continue;
			}
			if (prime){
				System.out.println(i);
			}
		}
		
	} // main
} // class