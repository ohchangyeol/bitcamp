//package jp01.part07;
import java.util.*;

public class ArrayListTest03 {
	//main method
	public static void main(String args[]){
		
		ArrayList<String> arrayList = new ArrayList<String>(10);

		String s1 = new String("1.ȫ");
		arrayList.add(s1);
		arrayList.add(new String("2.��"));
		arrayList.add("3.�� �ȳ��ϼ���");


		for (int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\nJDK 1.5 �߰���� :: Generic, Enhanced For Loop ���");
		for (String value : arrayList) {
			System.out.print(value);
		}
		
		System.out.println("\n ==> API Ȯ��");
		arrayList.add(1, "4.��");
		for (int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}

		System.out.println("\n ==> API Ȯ��");
		arrayList.add(3, "5.ȫ���");
		for (int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}

		System.out.println("\n ==> API Ȯ��");
		arrayList.remove(3);
		for (int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
	}//end of main
}//end of class
