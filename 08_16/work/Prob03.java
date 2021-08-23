public class Prob03{
	public static void main(String args[]){
		//System.out.println("hello, world");
		int [] array = {3, 24, 1, 55, 17, 43, 5};
		int temp = 0;
		for (int i = 0;i < array.length ; i++){
			//for (int j =  0 ; j < array.length ;j++ ){ 
				// 라고 했을땐 처음엔 하나씩 비교를 array[i]와 array[j]를 i가 더크다면 i의 값을 잠시 담아두고 j의 값으로 바꿔주고 j의 값은 i로 변경해준다.
				// 하지만 처음엔 작은 값이 바뀌어 들어가지만, 아래 반복문이 두번째 실행이 되면 다시 array[i]값이 array[0]번째 보다 높으면 안되는데 i가 array[1]=24 > array[0] =1 이기 때문에 참이라 다시 자리를 바꿔주는 현상이 일어나게된다.그래서 처음부터 비교를 하는것이 아닌 자기보다 작은 값을 앞으로 밀고 현재 자리부터 작은값으로 대입시킨다는걸 알게되었다.
			for (int j =  i ; j < array.length ;j++ ){
				if (array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					//System.out.println("change");
				}//end of if
			//System.out.println("array [i"+i+"] = "+array[i]+"\t >\tarray [j"+j+"] = "+array[j]);
			}// end of j for
			//System.out.println("========");
			System.out.print(array[i]);
			if(i != array.length-1){
				System.out.print(", ");
			}else{
				System.out.println("");
			}
		
		}//end of i for
	}
}