public class ArrayTest01 
{
	public static void main(String[] args) 
	{
		/*
		int [] intArray new int[9];
		intArray [0] = 1;
		intArray [1] = 2;
		intArray [2] = 3;
		intArray [3] = 4;
		intArray [4] = 5;
		intArray [5] = 6;
		intArray [6] = 7;
		intArray [7] = 8;
		intArray [8] = 9;
		*/
		int [] intArray = {1,2,3,4,5,6,7,8,9};
		//int [] intArray = new int[]{1,2,3,4,5,6,7,8,9};
		for (int j = 0 ;j < 9 ;j++ )
		{
			System.out.println("intArray["+j+"] ���� :" +intArray[j]);		
		}
		// Operator �� length keword ���
		System.out.println("============");
		for (int k = 0; k < intArray.length;k++ )
		{
			System.out.println( "5 X " + intArray[k] + " = " +5 * intArray[k]);
		}
		int [] j =intArray;
		System.out.println("=================");
		System.out.println("j[0]�� ���� :" + j[0]);
		System.out.println("j[5]�� ���� :" + j[5]);

		j [5] = 1234;
		System.out.println("=================");
		System.out.println("j[5]==> " + j[5]);
		System.out.println("i[5]==> " + intArray[5]);
		
		System.out.println("=================");
		int a = 1 ;
		int b = a ;
		System.out.println("a = " +  a ); // 1
		System.out.println("b = " +  b ); // 2
		b = 10;
		System.out.println("a = " +  a ); // 1
		System.out.println("b = " +  b ); // 10

		System.out.println("=================");

		String a1 = "������",
			b1 = a1 ;
		System.out.println(a1);
		System.out.println(b1);
			b1 = "������ ��";
		System.out.println(a1);
		System.out.println(b1);
		//���� �������̶�� �ϴ��� �̰� value��.

		/*
		a�� ������ �ƴ� �⺻ ������Ÿ���̴�.
		*/

	}	

}
//		System.out.println("Hello World!");