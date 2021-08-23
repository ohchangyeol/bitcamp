import java.util.Scanner;

public class Prob1{
	public static void main(String[] args){
		int number = 0;
		int count = 0;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요.");
		number = keyboard.nextInt();

		if (number < 1 || number > 1000){
			System.out.println("1 ~ 1000까지의 수를 입력하세요.");
			return;
		}
		/*
		for (int i = 0;i < 1000 ; i++){
			//System.out.println("i = " + i +"number = "+number+ " = "+  i % number);
			if(i != 0 && i % number == 0){
				count++;
				//System.out.println("cont = "+count+"  sum = "+ sum);		
				sum+= i;
			}
		}
		*/
		for (int i = 1;i < 1000 ; i++){
			if(i % number == 0){
				count++;
				sum+= i;
			}
		}

		System.out.println( number + "의 배수의 개수 = " + count + "\n"+  number + "의 배수의 합 = " + sum );

	}//main of main
}//end of class