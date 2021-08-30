package ex1;

public class Prob1 {

	public String toEncoding(String str) {
		String result = "";
		byte[] temp = str.getBytes();
		for (int i =0; i< temp.length ; i++) {
			if (temp[i] < 0 ) {
//				System.out.println(Integer.toHexString(temp[i]).substring(6).toUpperCase());
				result += "%" + Integer.toHexString(temp[i]).substring(6).toUpperCase();
			}else {
				result += Character.toString((char)temp[i]);
			}
		}// end of for
		return result;
	}
	
	// main Method
	public static void main(String[] args) {
		// ***************흰트 16진수 변환****************
		Prob1 p1 = new Prob1();
		System.out.println("입력 : Korea");
		System.out.println("출력 : "+p1.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 :"+p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : "+p1.toEncoding("홍길 동"));
		System.out.println("입력 : hong 길 동");
		System.out.println("출력 : "+p1.toEncoding("hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : "+p1.toEncoding("0319"));
	}

}
