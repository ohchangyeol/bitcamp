public class ExceptionTest01{
	//Field
	private int sum;
	private int avg;

	//Consturctor
	public ExceptionTest01(){
	}

	//Method
	public void sum(int x, int y){
		System.out.println("1. ==> sum ����");
		sum = x+y;
		System.out.println("1. ==> �� : "+sum);
		System.out.println("1. ==> sum �� ");
	}

	//���ڰ����� 0�� ������ ���� �߻�
	public void avg(int z){
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

		ExceptionTest01 et = new ExceptionTest01();
		et.sum(i,j);
		et.avg(k);
	}
}