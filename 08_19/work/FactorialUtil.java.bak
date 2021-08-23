import java.util.Scanner;

public class FactorialUtil{

	int i= 1 ;
	int sum = 1 ;
	// Recursive Method
	public int factorial(int n ){
		if (i > n) {
			return sum;
		}
		sum*=i;
		i++;
		return this.factorial(n);
		
	}
	/*
	public int factorial(int n ){
		for (int i = n ;i >= 1 ;i-- ){
			sum *= i;
			str += i+ "";
			if (i != 1){
				str += " * ";
			}
		}
		return sum;
	}
	*/
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input   =  ");

		int inputInt = keyboard.nextInt();
		
		FactorialUtil util = new FactorialUtil();
		System.out.print("Result = "+ util.factorial(inputInt));
		
	}//main
	
}//class