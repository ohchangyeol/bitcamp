public class Prob{
	public void calc(int[] ix){
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 0 ; i < ix.length; i++){
			if (ix[i] % 2 == 0)	evenSum += ix[i];
			else oddSum += ix[i];
		}
		System.out.println("Ȧ���� �� : "+oddSum +"\n"+"¦���� �� : "+ evenSum);
	}



	public static void main(String[] args){
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib = new int[]{1,2,3,4,5};

		Prob p = new Prob();
		System.out.println("(�迭 ia)");
		p.calc(ia);
		System.out.println("(�迭 ib)");
		p.calc(ib);
	}
}