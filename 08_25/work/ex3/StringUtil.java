import java.util.Vector;

public class StringUtil{
	

	private static String replaceString(String[] arr){
		int count=0;
		int temp=0;
		String result="";
		for (int i = 0 ; i < arr.length; i++){
			for(int j =0 ; j < arr[i].length();j++ ){// 카운터 증가.
				if (arr[i].charAt(j)=='a'){
					count++;
				}
			}// 하나의 데이터 값의 a의 수
			if (temp < count){ 
				temp = count;
				result = arr[i];
				count = 0;
			}
		}
		System.out.println(result);
		return result.replace('a', 'A');
	}
	public static void main(String[] agrs){
		
		String[] arr = {"java program","array","java program area","append"};
		String resuit = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 " + resuit);
	}//end of main

}//end of class 