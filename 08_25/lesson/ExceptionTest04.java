public class ExceptionTest04{
	//Field
	private int sum;
	private int avg;

	//Consturctor
	public ExceptionTest04(){
	}

	//Method
	public void sum(int x, int y){
		System.out.println("1. ==> sum ����");
		sum = x+y;
		System.out.println("1. ==> �� : "+sum);
		System.out.println("1. ==> sum �� ");
	}

	//���ڰ����� 0�� ������ ���� �߻�
	public void avg(int z)throws ArithmeticException{
		System.out.println("2. ==> avg ����");
		//z = 0 �ΰ�� �Ҵ�
		avg = sum/z;
		System.out.println("2. ==> ��� : "+ avg);
		System.out.println("2. ==> avg ��");
	}

	public static void main(String[] args){
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest04 et = new ExceptionTest04();
		et.sum(i,j);
		
		
		// JVM���� ���� ��,prgram���� throws�ϴ� Exception(����ó��)�� �ذ�å�� try-catch
		try{
			et.avg(k);			
		}catch(Throwable e){
		//}catch(Object e){
		//}catch(Exception e){ // Exception e = new ArithmeticException()�� �����Ѱ�?
			System.out.println("1. >> ===================");
			System.out.println("et.avg(k)���� Exception�� �߻��� ���");
			System.out.println("2. >> ===================");
			System.out.println(e);//System.out.println(e.toString());
			System.out.println("3. >> ===================");
			e.printStackTrace();
			System.out.println("4. >> ===================");
		}
		
		System.out.println("main Method End ...");
	}
}