public class Prob02{
	public static void main(String args[]){
		//System.out.println("hello");
		int limit = 50;

		//count를 활용한 소수 구하기. 2,3,5,7,11 ....41,43,47
		int count = 0;// 소수를 출력하기 위한 count.
		for (int i = 2 ; i < limit ; i++ ){ // 0,1 은 소수가 아니다. 그래서 2부터 시작.
			for (int j= 2 ;j < limit ;j++ ){ // 이것도 마찬가지로 0,1 은 소수가 아니라서 2부터 시작.

			//System.out.println("i = "+ i + "\t\t j = "+ j);
			// 일단 하나씩 다 출력...
			//System.out.println("i = "+ i + "\t\t j = "+ j+" \n 나머지 연산자 구하기 =  "+i % j);
			// %연산자는 뒤에 값이 더 크다면 나머지 값을 구하지않는다.   3 % 2 = 1,	3 % 3 = 0,   3 % 4 =  4 ;

				if (i % j == 0){ // %연산자는 앞에있는 수 뒤에있는 수 나누기의 나머지 값. 3 % 2 = 1,    3 % 4 = 
						count ++;
						//System.out.println("count = "+count);
					}
			}
			//System.out.println("count = "+count);
			if (count == 1){
				System.out.println(i);
			}
			count= 0;
		}
		
		
		// boolean 을 사용한 소수 구하기.
		/*
		boolean prime = false;
		for (int i = 2;i < limit ;i++ ){
			for (int j = 2 ; j < i; j++){
				//System.out.println( "i = " + i +"\t j = "+ j );
				if (i % j == 0){
					prime = true;
					//System.out.println( "i = " + i +"\t j = "+ j + "\t"+prime);
				}		
				continue;
			}
			if (prime == false){
				System.out.println(i);
			}
			prime = false;//초기화
		}
		*/
	} // main
} // class