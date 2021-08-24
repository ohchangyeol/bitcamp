//package jp01.part07;
import java.util.*;

public class VectorTest03 {
	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>(10,10);

		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3.님 안녕하세요");

		for (int i=0; i<vector.size(); i++) {
			String s = vector.elementAt(i);
			//String s = (String)vector.elementAt(i);
			System.out.print(s);
			//System.out.print((String)vector.elementAt(i));
		}

		System.out.println("\nJDK 1.5 추가기능 :: Generic, Enhanced For Loop 사용");

		for (String value : vector) {
			System.out.print(value);
		}
		
		System.out.println("\n ==> API 확인");
		vector.insertElementAt("4.길", 1);
		for (int i=0; i<vector.size(); i++) {
			System.out.print((String) vector.elementAt(i));
		}

		System.out.println("\n ==> API 확인");
		vector.insertElementAt("5.홍길순", 3);
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
