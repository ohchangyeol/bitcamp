public class User02 {
    //Field 
    String name;
    int javaLevel;

    //Constructor = ������
	public User02() {
    //public User022() { // �̸��� �ٸ��� �������� ���. error => invalid method declaration; return type required �߸��� �޼��� ����,��ȯ�� �ʿ���
						 // void �� ������ return���� ��ȯ�� �ؾ��Ѵ�.������ class�� �̸��� method�� �̸��� ���ٸ� �ν��Ͻ� ������ ȣ���� ������ field variable �� �ʱ�ȭ �۾��� �����ϴ�.
        System.out.println("Constructor Method");
        name = "ȫ�浿";
        javaLevel = 0 ;
    }

    // Method
    public String getName() {
        return name;
    }
    public int getJavaLevel() {
        return javaLevel;
    }

    //main
    public static void main(String[] args) {
        
        System.out.println("=================");
        User02 user = new User02();
        System.out.println("=================");

        System.out.println("name" + user.getName());
        System.out.println("javaLevel" + user.getJavaLevel());
    }
    
}