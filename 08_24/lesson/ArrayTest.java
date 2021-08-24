
import java.util.*;

public class ArrayTest{

	public static void main (String[] args){
		int[] arr = {1,5,7,3,7};
		int leng = 10;
		for (int i : arr){
			System.out.println(i);
		}

		//for(int ex : leng){
		//	System.out.print(ex + ", ");
		//}
		
		Vector <String> strArr = new Vector<>(10, 10);
		strArr.add("ø¿√¢ø≠");
		strArr.add(1);
		System.out.println(strArr.elementAt(0));
		System.out.println(strArr.elementAt(1));
	}
}