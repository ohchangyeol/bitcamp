public class SeparateEquralsArr{  
   
    public static boolean getEq(int[] arr1, int[] arr2) {
        if(arr1.length==arr2.length) return equralsArr(arr1,arr2);
        return false;
    }
    // private method
    private static boolean equralsArr(int[] arr1, int[] arr2) {
        int i;
        for (i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) continue;
            }
        }
        if(i == arr1.length) return true;
        return false;

    }

}

