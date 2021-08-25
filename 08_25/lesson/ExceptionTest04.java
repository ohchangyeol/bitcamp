public class ExceptionTest04{
	//Field
	private int sum;
	private int avg;

	//Consturctor
	public ExceptionTest04(){
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

	public static void main(String[] args){
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest04 et = new ExceptionTest04();
		et.sum(i,j);
		
		
		// JVM에서 던진 건,prgram에서 throws하던 Exception(예외처리)의 해결책은 try-catch
		try{
			et.avg(k);			
		}catch(Throwable e){
		//}catch(Object e){
		//}catch(Exception e){ // Exception e = new ArithmeticException()은 가능한가?
			System.out.println("1. >> ===================");
			System.out.println("et.avg(k)에서 Exception이 발생한 모양");
			System.out.println("2. >> ===================");
			System.out.println(e);//System.out.println(e.toString());
			System.out.println("3. >> ===================");
			e.printStackTrace();
			System.out.println("4. >> ===================");
		}
		
		System.out.println("main Method End ...");
	}
}