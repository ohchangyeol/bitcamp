public class ExceptionTest05{
	//Field
	private int sum;
	private int avg;

	//Consturctor
	public ExceptionTest05(){
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

	public static void main(String[] args)throws ArithmeticException{
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest05 et = new ExceptionTest05();
		et.sum(i,j);
		et.avg(k);// JVM���� ���� �� �ٽ� ������ JVM���� ������������
		
		
		
		
		System.out.println("main Method End ...");
	}
}