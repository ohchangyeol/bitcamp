public class Prob02{
	public static void main(String args[]){
		//System.out.println("hello");
		int limit = 50;

		//count�� Ȱ���� �Ҽ� ���ϱ�. 2,3,5,7,11 ....41,43,47
		int count = 0;// �Ҽ��� ����ϱ� ���� count.
		for (int i = 2 ; i < limit ; i++ ){ // 0,1 �� �Ҽ��� �ƴϴ�. �׷��� 2���� ����.
			for (int j= 2 ;j < limit ;j++ ){ // �̰͵� ���������� 0,1 �� �Ҽ��� �ƴ϶� 2���� ����.

			//System.out.println("i = "+ i + "\t\t j = "+ j);
			// �ϴ� �ϳ��� �� ���...
			//System.out.println("i = "+ i + "\t\t j = "+ j+" \n ������ ������ ���ϱ� =  "+i % j);
			// %�����ڴ� �ڿ� ���� �� ũ�ٸ� ������ ���� �������ʴ´�.   3 % 2 = 1,	3 % 3 = 0,   3 % 4 =  4 ;

				if (i % j == 0){ // %�����ڴ� �տ��ִ� �� �ڿ��ִ� �� �������� ������ ��. 3 % 2 = 1,    3 % 4 = 
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
		
		
		// boolean �� ����� �Ҽ� ���ϱ�.
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
			prime = false;//�ʱ�ȭ
		}
		*/
	} // main
} // class