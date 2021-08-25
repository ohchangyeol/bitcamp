public class ExceptionTest05{
	//Field
	private int sum;
	private int avg;

	//Consturctor
	public ExceptionTest05(){
	}

	//Method
	public void sum(int x, int y){
		System.out.println("1. ==> sum 시작");
		sum = x+y;
		System.out.println("1. ==> 합 : "+sum);
		System.out.println("1. ==> sum 끝 ");
	}

	//인자값으로 0이 들어오면 문제 발생
	public void avg(int z)throws ArithmeticException{
		System.out.println("2. ==> avg 시작");
		//z = 0 인경우 불능
		avg = sum/z;
		System.out.println("2. ==> 평균 : "+ avg);
		System.out.println("2. ==> avg 끝");
	}

	public static void main(String[] args)throws ArithmeticException{
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest05 et = new ExceptionTest05();
		et.sum(i,j);
		et.avg(k);// JVM에서 던진 걸 다시 메인이 JVM에게 던짐ㅋㅋㅋㅋ
		
		
		
		
		System.out.println("main Method End ...");
	}
}