public class Example1Refactoring { 
    public static void main(String[] args) { 
		//args�� ���� Ȯ��
		if(args.length != 1 ){
			System.out.println("args�� �Է��ϰų�, 1�� �̻� �ʰ��߳�?");
			return;
		}
		// ���� �ִٸ� Data�� ��������.
        int inputData = Integer.parseInt(args[0]);
		String value = "��";
		//inputData�� ���� ���� ��ȿ�� Ȯ��.
		if (inputData < 0 || inputData > 100){
			System.out.println("�̾�. ���� ���� 0~100�� ������ �ƴϾ�");
			return;
		}
		switch (inputData/10) { 
			case 10:break;
			case 9: break;
			case 8: 
				value="��"; //���̽� 8�� ���๮�� ����Ǿ� ���������� value �� ���� "��"�� ����.
				break; 
			case 7: 
				value="��";
				break; 
			case 6: 
				value="��"; 
				break; 
			default : value="��"; // ������ ��
		}
		System.out.println("�Է��Ͻ� �� "+inputData+ "���� " +value+"�Դϴ�.");
    }// end of main
}//end of class
