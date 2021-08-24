//package jp01.part05;
import java.util.*;

public class VectorTest01refactoring extends Vector {

	//Field

	//consturctor
	public VectorTest01refactoring(){}
	public VectorTest01refactoring(int initialCapacity, int capacityIncrement){
		super(initialCapacity, capacityIncrement);
	}
	//method
	public void printString(Vector vector){
//		for (int i=0; i<vector.size(); i++) {
//			System.out.print((String)vector.elementAt(i));
//		}
	
		for (Object obj : vector ){
			System.out.print((String)obj);
		}	
	}

	public static void main(String[] args) {

		VectorTest01refactoring vector = new VectorTest01refactoring(10,10);

		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3.님 안녕하세요");

		vector.printString(vector);

		System.out.println("\n ==> API 확인");
		vector.insertElementAt("4.길", 1);
		vector.printString(vector);

		System.out.println("\n ==> API 확인");
		vector.setElementAt("5.홍길순", 3);
		vector.printString(vector);

		System.out.println("\n ==> API 확인");
		vector.removeElementAt(3);
		vector.printString(vector);
		
	}
}
