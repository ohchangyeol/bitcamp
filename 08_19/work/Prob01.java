import java.util.Scanner;

public class Prob01{
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���.");
		int inputInt = keyboard.nextInt();
		int sum = 1 ;
		if (inputInt < 1 || inputInt > 10 ){
			System.out.print("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}
		for (int i = 1 ;i <= inputInt ;i++ ){
			sum *= i;
			System.out.println(i + " != "+ sum );
		}
	}//main

}//class