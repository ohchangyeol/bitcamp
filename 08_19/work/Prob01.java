import java.util.Scanner;

public class Prob01{
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요.");
		int inputInt = keyboard.nextInt();
		int sum = 1 ;
		if (inputInt < 1 || inputInt > 10 ){
			System.out.print("잘못된 숫자가 입력되었습니다.");
			return;
		}
		for (int i = 1 ;i <= inputInt ;i++ ){
			sum *= i;
			System.out.println(i + " != "+ sum );
		}
	}//main

}//class