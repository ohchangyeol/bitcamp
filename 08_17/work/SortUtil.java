public class SortUtil{

	// 오름차순 정렬
	public int[] arscanding(int[] intputNumbers ){
		int tmep = 0;
		for (int i = 0; i < intputNumbers.length ;i++ ){
			for (int j = i ;j < intputNumbers.length ;j++ ){
				if(intputNumbers[i] > intputNumbers[j]){
					tmep = intputNumbers[i];
					intputNumbers[i] = intputNumbers[j];
					intputNumbers[j] = tmep;
				}
			}
		}
		return intputNumbers;
	}
	// 
	public void commaSkip (int[] arr) {
		for(int i = 0; i < arr.length; i ++){
			System.out.print(arr[i]);
			if(i != arr.length-1){
				System.out.print(", ");
			}else{
				System.out.println("");
			}
		}
	}

	public static void main(String[] args){

		SortUtil util = new SortUtil();
		int[] numbers =new int[] {7,5,2,19,34,51,32,11,67,21 };
		
		numbers = util.arscanding(numbers);
		util.commaSkip(numbers);
		System.out.println("Successful!!!");

	}//main of main
}//end of class