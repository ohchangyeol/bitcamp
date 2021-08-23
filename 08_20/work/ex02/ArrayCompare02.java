public class ArrayCompare02 {

	public static void main(String[] args) {
		int[] arr1 = {3,5,6,9,10,2,7};
		int[] arr2 = {3,5,6,9,10,2,7};
		if(SeparateEquralsArr.getEq(arr1,arr2)){
			System.out.println("two array equals");
		}else{
			System.out.println("two array not-equals");
		}
		
		System.out.println("=====================");

		int[] arr3 = {3,5,6,9};
		int[] arr4 = {3,5,6,9,8};
		if(SeparateEquralsArr.getEq(arr3,arr4)){
			System.out.println("two array equals");
		}else{
			System.out.println("two array not-equals");
		}
	}
}