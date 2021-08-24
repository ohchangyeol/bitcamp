public class Adder{
	// Method
	public int execute(String expr){
		int result = 0 ;
		String strNum = "";
		for(int i = 0;i< expr.length() ;i++ ){
			char c = expr.charAt(i);
			//System.out.println("c  = "+ c );
			if(c == '+'){
				result += Integer.parseInt(strNum);
				strNum ="" ;
			}else {
				strNum +=c  ;
			//System.out.println("strNum = "+ strNum );
			}
		}
		return result + Integer.parseInt(strNum);
	}

	//main Method
	public static void main(String[] args){
		Adder adder = new Adder();
		String expr = "3+5+9+1";
		System.out.println(expr + " = " + adder.execute(expr));

		expr = "11+45+77+3";
		System.out.println(expr + " = " + adder.execute(expr));
		
		expr = "33+51+12+11";
		System.out.println(expr + " = " + adder.execute(expr));
	}

}