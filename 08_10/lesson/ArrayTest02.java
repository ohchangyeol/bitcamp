public class ArrayTest02 
{
	public static void main(String[] args) 
	{
	
		int [][] value = new int [9][9];
		int count = 0;
		for (int i = 0;i < 9 ; i++)
		{
			value[0][i] = 1 * ( i + 1 );
			//System.out.println(value[0][i]);
		}
			//System.out.println(value.length);
			//System.out.println(value[0].length);
			for (int j = 0 ; j < value.length  ;j++ )
			{
				System.out.println("================");
				// System.out.println(value[j].length );
				for (int k = 0; k <value[j].length ; k++)
				{
					count++;
					System.out.println("value["+j+"]["+ k +"] = "+ value[j][k]);

					// �迭�� �ʱⰪ�� �־������ʾƵ� �ڵ����� �ʱ�ȭ�Ǿ� �ִ�.
				}
			}
			System.out.println("�� �迭�� ����"+count);

	}//end of main

}//end of class
