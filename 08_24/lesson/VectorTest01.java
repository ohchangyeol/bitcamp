//package jp01.part05;
import java.util.*;

public class VectorTest01 {

	//Field

	//consturctor

	//method


	public static void main(String[] args) {

		Vector vector = new Vector(10,10);

		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3.님 안녕하세요");

		for (int i=0; i<vector.size(); i++) {
			System.out.print((String)vector.elementAt(i));
		}

		System.out.println("\n ==> API 확인");
		vector.insertElementAt("4.길", 1);
		for (int i=0; i<vector.size(); i++) {
			System.out.print((String) vector.elementAt(i));
		}

		System.out.println("\n ==> API 확인");
		vector.setElementAt("5.홍길순", 3);
		for (int i=0; i<vector.size(); i++) {
			System.out.print((String) vector.elementAt(i));
		}

		System.out.println("\n ==> API 확인");
		vector.removeElementAt(3);
		for (int i=0; i<vector.size(); i++) {
			System.out.print((String) vector.elementAt(i));
		}
		
	}
}
