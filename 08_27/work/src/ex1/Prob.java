package ex1;

public class Prob {
	
	public static void Pyramid (int inputInt) {
		for (int i = 0 ; i < inputInt ; i++){
			String sum = "";
			for(int j = 1; j < inputInt - i; j++ ) {
				sum += " ";
			}
			for(int k = 0 ; k < i*2+1; k++) {
				sum +="*";
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Prob.Pyramid(Integer.parseInt(args[0]));
	}
}
