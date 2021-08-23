public class ArrayCompare01 {

	private static boolean equralsArr(int[] arr1, int[] arr2) {
		int i;
		if(arr1.length==arr2.length){
			for (i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) 
					if (arr1[i] == arr2[j]) continue;
				
			}
			if(i == arr1.length) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr1 = {3,5,6,9,10,2,7};
		int[] arr2 = {3,5,6,9,10,2,7};
		if(equralsArr(arr1,arr2)) {
			System.out.println("two array equals");
		}
		else System.out.println("two array not-equals");
		
		System.out.println("=====================");

		int[] arr3 = {3,5,6,9};
		int[] arr4 = {3,5,6,9,8};
		if(equralsArr(arr3,arr4)) {
			System.out.println("two array equals");
		}
		else System.out.println("two array not-equals");
	}
}