public class Example1 { 
    public static void main(String[] args) { 
        int inputData = Integer.parseInt(args[0]);
		String value = "��"; // �ʱ� ����.
		// ��ȿ�� ���� Ȯ��
		/*
        if (inputData >= 0 && inputData <= 100 ){ // �Է°��� 0~ 100 ���� ����-> inputData�� 0 ���ų� ũ�� ��, �׸��� inputData���� 100�� ũ�ų� ������ ��. �� ������ ������ ���๮����.
			//System.out.println(inputData/10); ��Ƽ�� ���� �Ǽ��� ������.
		//if (inputData > 100 || inputData < 0){
			switch (inputData/10) { 
            	case 10: 
            		break;
            	case 9: 
            		break; 
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
			
			�������� ������ �ݺ��Ǵ°� ����.

			if (inputData >= 90){ // ���޹��� ���ڰ� 90���� ���ų� ũ�� ����
				System.out.println("�Է��Ͻ� �� "+inputData+ "���� " +value+"�Դϴ�.");
			}else if (inputData >= 80 && inputData < 90){
				value="��";
				System.out.println("�Է��Ͻ� �� "+inputData+ "���� " +value+"�Դϴ�.");
			}else if (inputData >= 70 && inputData < 80){
				value="��";
				System.out.println("�Է��Ͻ� �� "+inputData+ "���� " +value+"�Դϴ�.");
			}else if (inputData >= 60 && inputData < 70){
				value="��";
				System.out.println("�Է��Ͻ� �� "+inputData+ "���� " +value+"�Դϴ�.");
			}else{
				value="��";
				System.out.println("�Է��Ͻ� �� "+inputData+ "���� " +value+"�Դϴ�.");
			}
			
            
        }else {
            System.out.println("0 ~ 100 ������ ���� �ƴմϴ�.");
        }
		*/
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
    }
}
