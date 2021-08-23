public class Prob02 {
	// 두개의 숫자를 매개 변수로 받아서 두 숫자 사이의 차를 구하되, 실행 결과가 음수일 경우 양의 정수로 변경하여 리턴하는 abs()메서드를 구현하시오.
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
		System.out.println("두 수의 차는 " + prob.abs(num1, num2));
	}
}