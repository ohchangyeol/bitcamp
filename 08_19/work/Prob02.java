import java.util.Scanner;

public class Prob02{

	public void printSeason (int month) {
		String born = "�� �¾�̳׿�.";
		if (month < 1 || month > 12){
			System.out.println("1 ~ 12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
			return;
		}else{
			if (month >= 3 && month <= 5){
				System.out.println("��"+born);
			}else if (month >= 6 && month <= 8){
				System.out.println("����"+born);
			}else if (month >= 9 && month <= 11){
				System.out.println("����"+born);
			}else{
				System.out.println("�ܿ�"+born);
			}
		}
		
	}

	public static void main(String[] args){
		
		int month = Integer.parseInt(args[0]);
		Prob02 prob = new Prob02();
		
		prob.printSeason(month);
		
	}//main
	
}//class