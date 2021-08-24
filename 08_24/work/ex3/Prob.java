public class Prob{
	// Method
	public String leftPad(String str , int size , char padChar){
		String result = "";
		for (int i = 0;i < size-str.length();i++ ){
			result +=padChar;
		}
		return result+str;
	} //end of method

	//main Method
	public static void main(String[] args){
		Prob Prob3 = new Prob();
		
		System.out.println(Prob3.leftPad("ABC",6,'#'));
		System.out.println(Prob3.leftPad("ABC",5,'$'));
		System.out.println(Prob3.leftPad("ABC",2,'&'));
	}// end of main
}// end of class