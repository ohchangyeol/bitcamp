public class Example2Refactoring{

 //main method
	public static void main(String[] args){
		//��ȿ�� - args �ִ��� ������.
		if (args.length != 1){
			System.out.println("args�� �Է��ϰų�, 1�� �̻� �ʰ��߳�?");
			return;
		}

		//Variable - ����
		int inputInt = Integer.parseInt(args[0]);

		//��ȿ�� - Input ���� 1~9
		if (intputInt < 0 || inputInt > 10 ){
			System.out.println("1 ~ 9 ������ ���� �Է��� ��.");
			return;
		}

		//source - �ҽ�
		System.out.println( inputInt + " ���� ����մϴ�." );
		for (int i = 1 ; i <=9 ; i++ ){
			System.out.println( i + " * " + inputInt + " = " + i * inputInt);
		}
	
	} //end of main

}// end of class


