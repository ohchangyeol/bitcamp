import java.util.Scanner;

public class Prob01 {
	//main
	public static void main (String args[]){
		//System.out.println("hello,java");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. ");
		int inputInt = keyboard.nextInt();
		
		//System.out.println(inputInt);
		if (inputInt > 1 && inputInt < 10){
			for (int i = 1; i < 10 ; i++) {
				System.out.println(inputInt + " * " + i +" = " +inputInt * i);
			}
		}else{
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}
	} //end of main
}//end of class