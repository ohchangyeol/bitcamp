public class Example5
{
	public static void main(String[] args) 
	{
		String[][] text = new String[9][9];
		
		//while
		int i = 0;
		int j = 0;
		while(i < text.length){
			System.out.println(i+1+"���� ����մϴ�.");
			while(j < text[i].length){
				text[i][j] = (i + 1)*(j + 1 )+"" ;
				System.out.println("text[" + i + "]["+j+ "] : " + (i + 1 )+" * "+(j + 1 ) + " = " + text[i][j] );
				j++;
			}
			//System.out.println("j = "+ j);
			j=0;
			i++;
		} 
		// 1�� ������ 2���� ��������ʴ´�. 
		// i�� 1�� �ʱ�ȭ ���ָ� ù��° while ���� ���� �������ϱ� i�� �ʱ�ȭ �����ָ� ū�ϳ���.
		// j�� �ʱ�ȭ������� �ϴµ� �ι�° while���� j�� �ʱ�ȭ �ϸ� ���� ������ ������ ?.
		// 1�� ������ j�� 9�� ���ֱ� ������ ������ �����ʾ� �����ʴ°��� Ȯ���ߴ�.
		// �׷� �ι�° �ݺ��� ������ �ʱ�ȭ ��Ű�� 2�� �ݺ����� ���� ��Ű��.
		
		/*
		//for
		for (int i = 0 ; i < text.length; i++ )
		{
			System.out.println(i+1+"���� ����մϴ�.");
			for (int j = 0 ; j < text[i].length ;j++ )
			{
				text[i][j] = Integer.toString((i + 1)*(j + 1 )) ;
				System.out.println("text[" + i + "]["+j+ "] : " + (i + 1 )+" * "+(j + 1 ) + " = " + text[i][j] );
			}
		}
		*/
	}
}
