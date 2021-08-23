public class Example2Refactoring{

 //main method
	public static void main(String[] args){
		//유효성 - args 있는지 없는지.
		if (args.length != 1){
			System.out.println("args를 입력하거나, 1개 이상 초과했네?");
			return;
		}

		//Variable - 변수
		int inputInt = Integer.parseInt(args[0]);

		//유효성 - Input 값이 1~9
		if (intputInt < 0 || inputInt > 10 ){
			System.out.println("1 ~ 9 까지의 값을 입력할 것.");
			return;
		}

		//source - 소스
		System.out.println( inputInt + " 단을 출력합니다." );
		for (int i = 1 ; i <=9 ; i++ ){
			System.out.println( i + " * " + inputInt + " = " + i * inputInt);
		}
	
	} //end of main

}// end of class


