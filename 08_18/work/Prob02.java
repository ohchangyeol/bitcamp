public class Prob02 {
	// �ΰ��� ���ڸ� �Ű� ������ �޾Ƽ� �� ���� ������ ���� ���ϵ�, ���� ����� ������ ��� ���� ������ �����Ͽ� �����ϴ� abs()�޼��带 �����Ͻÿ�.
	public int abs(int num1, int num2) {
		int sum = num1 - num2;
		if(0 > sum){
			return sum * -1;
		}else{
			return sum;
		}
	}
	public static void main(String[] args){
		int num1 = 9;
		int num2 = 10;

		Prob02 prob = new Prob02();
		System.out.println("�� ���� ���� " + prob.abs(num1, num2));
	}
}