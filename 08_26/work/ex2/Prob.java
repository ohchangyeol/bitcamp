public class Prob{

	public Prob() {
		// TODO Auto-generated constructor stub	
	}
	
	//method
	public static String myReplace(String str , char oldChar, char newChar) {
		// String newString = ""; // String 으로 만들기
		StringBuffer newString = new StringBuffer(); // Buffer로 만들기
		for(int i = 0 ; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == oldChar) {
				c = newChar;
			}
			// newString += Character.toString(c); // String으로 만들기
			newString.append(c); // Buffer로 만들기
		}
		// return newString; // String으로 만들기
		return newString.toString(); // Buffer로 만들기
		
	}

	public static void main(String[] args){
		System.out.println("문자열에 특정 문자 변경하는 테스트");
		System.out.println("------------ Sample 1 ------------");
		String srt1 = myReplace("hello world" , 'l','*');
		System.out.println(srt1);

		System.out.println("------------ Sample 1 ------------");
		String srt2 = myReplace("hello world" , ' ','-');
		System.out.println(srt2);

		System.out.println("------------ Sample 1 ------------");
		String srt3 = myReplace("hello world" , 'a','*');
		System.out.println(srt3);
		
	}
	
}