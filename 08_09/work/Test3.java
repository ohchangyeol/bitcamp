// FileName : Test3.java

public class Test3 {
    public static void main(String args []) {
        int i = Integer.parseInt(args[0]);// �Ʊ���Ʈ�� �޾� ��Ʈ�� ������Ÿ���� ��Ƽ���� �ٲ��ش�.
        int j = Integer.parseInt(args[1]);
        
		//���� Ȧ�� ¦�� ������
        //6,9,12 �� 2,3�� �����
        //i - ¦��
        if (i % 2 == 0) { //������ �����ڸ� ���� 0 �� ������ if�� ����.
            if ( i % 3 == 0){ //������ �����ڸ� ���� 0�� �Ǹ� 3�� ��� 
                System.out.println("�Է��Ͻ� 1��° ���ڰ�"+i+"�� ¦���̸� 3�ǹ���Դϴ�.");   
            }else{
                System.out.println("�Է��Ͻ� 1��° ���ڰ�"+i+"�� ¦���̸� 3�ǹ���� �ƴմϴ�.");   
            } 
        }else{ // i - Ȧ��
            if ( i % 3 == 0){
                System.out.println("�Է��Ͻ� 1��° ���ڰ�"+i+"�� Ȧ���̸� 3�ǹ���Դϴ�.");   
            }else{
                System.out.println("�Է��Ͻ� 1��° ���ڰ�"+i+"�� Ȧ���̸� 3�ǹ���� �ƴմϴ�.");   
            }
        }

        //j - i�� ¦�� Ȧ�� �����ٸ� j�� ¦�� Ȧ�� �����ֱ�
        if (j % 2 == 0) { 
            if ( j % 3 == 0){
                System.out.println("�Է��Ͻ� 2��° ���ڰ�"+j+"�� ¦���̸� 3�ǹ���Դϴ�.");   
            }else{
                System.out.println("�Է��Ͻ� 2��° ���ڰ�"+j+"�� ¦���̸� 3�ǹ���� �ƴմϴ�.");   
            } 
        }else{ 
            if ( j % 3 == 0){
                System.out.println("�Է��Ͻ� 2��° ���ڰ�"+j+"�� Ȧ���̸� 3�ǹ���Դϴ�.");   
            }else{
                System.out.println("�Է��Ͻ� 2��° ���ڰ�"+j+"�� Ȧ���̸� 3�ǹ���� �ƴմϴ�.");   
            }
        }
		
    }	
}
