// FileName : Test2.java

public class Test2 {
    public static void main(String args []) {
        int i = Integer.parseInt(args[0]); // �Ʊ���Ʈ�� �޾� ��Ʈ�� ������Ÿ���� ��Ƽ���� �ٲ��ش�.
        int j = Integer.parseInt(args[1]);
        //int sum; // i�� j�� ��ġ�ų� �� ������ ���� ��������. error ->
		int sum=0;
        if(i>j){ //i�� j���� Ŭ�� 
            sum = i-j; //���������� i�� j�� �� ���� ����.
			//System.out.println(sum);
            System.out.println("ù��° �μ� :"+i+ ", �ι�° �μ� : "+j+",\t"+i+" - "+j+" = "+ sum); //���
			
		}else if(i<j){// else�� ���⿣ ==�� ���� ���� �ֱ� ������ else if Ȱ��.
            sum = i+j;
            System.out.println("ù��° �μ� :"+i+ ", �ι�° �μ� : "+j+",\t"+i+" + "+j+" = "+sum);
        }else{ 
			System.out.println("ù��° �μ� :"+i+ ", �ι�° �μ� : "+j+", \t ù��° �μ��� �ι�° �μ��� ���� �����ϴ�.");
		}
    }
}
