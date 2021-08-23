public class Example5
{
	public static void main(String[] args) 
	{
		String[][] text = new String[9][9];
		
		//while
		int i = 0;
		int j = 0;
		while(i < text.length){
			System.out.println(i+1+"단을 출력합니다.");
			while(j < text[i].length){
				text[i][j] = (i + 1)*(j + 1 )+"" ;
				System.out.println("text[" + i + "]["+j+ "] : " + (i + 1 )+" * "+(j + 1 ) + " = " + text[i][j] );
				j++;
			}
			//System.out.println("j = "+ j);
			j=0;
			i++;
		} 
		// 1단 연산후 2단이 연산되지않는다. 
		// i를 1로 초기화 해주면 첫번째 while 문이 무한 루프도니까 i를 초기화 시켜주면 큰일난다.
		// j를 초기화시켜줘야 하는데 두번째 while문에 j를 초기화 하면 무한 루프가 돌겠지 ?.
		// 1단 끝나면 j는 9이 되있기 때문에 조건이 맞지않아 돌지않는것을 확인했다.
		// 그럼 두번째 반복이 끝나면 초기화 시키면 2단 반복문을 실행 시키자.
		
		/*
		//for
		for (int i = 0 ; i < text.length; i++ )
		{
			System.out.println(i+1+"단을 출력합니다.");
			for (int j = 0 ; j < text[i].length ;j++ )
			{
				text[i][j] = Integer.toString((i + 1)*(j + 1 )) ;
				System.out.println("text[" + i + "]["+j+ "] : " + (i + 1 )+" * "+(j + 1 ) + " = " + text[i][j] );
			}
		}
		*/
	}
}
