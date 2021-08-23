public class Prob{
	public static void main(String[] args){
		String sourceString = "everyday we have is on more than we deserve";
		String encodedString="";
		 for(int index = 0 ; index < sourceString.length(); index++){
			char c =sourceString.charAt(index);
			int i = (int)c;
			if (i != 32){
				i += 3 ;
				if (i > 122){
					i -= 26;
				}
			}
			 encodedString += Character.toString((char)i);
		}
		System.out.println("암호화할 문자열 : "+ sourceString);
		System.out.println("암호화된 문자열 : "+ encodedString);
	}
}