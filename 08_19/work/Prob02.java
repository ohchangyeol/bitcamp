import java.util.Scanner;

public class Prob02{

	public void printSeason (int month) {
		String born = "에 태어나셨네요.";
		if (month < 1 || month > 12){
			System.out.println("1 ~ 12 사이의 숫자만 입력하셔야 합니다.");
			return;
		}else{
			if (month >= 3 && month <= 5){
				System.out.println("봄"+born);
			}else if (month >= 6 && month <= 8){
				System.out.println("여름"+born);
			}else if (month >= 9 && month <= 11){
				System.out.println("가을"+born);
			}else{
				System.out.println("겨울"+born);
			}
		}
		
	}

	public static void main(String[] args){
		
		int month = Integer.parseInt(args[0]);
		Prob02 prob = new Prob02();
		
		prob.printSeason(month);
		
	}//main
	
}//class