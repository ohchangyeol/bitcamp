public class MethodSyntexTestApp {

	/*
		bean�� MethodSyntax.class �� ����ϴ� application class.
	*/


    //field

    // main
    public static void main(String[] args) {
        MethodSyntax methodSyntax = new MethodSyntax();// instance.
        System.out.println("\n=========================");
        methodSyntax.browerOn();

        System.out.println("\n=========================");
        boolean resuit = methodSyntax.documentWork();
        System.out.println("doc �۾� ���� = " + resuit);

        System.out.println("\n=========================");
        int value = methodSyntax.sum(1, 1);
        System.out.println("��� ��� �� = " + value);
		// �� ������ �Ʒ��� ���� ǥ��, �ּ� Ǯ�� ��� Ȯ��. 
		//System.out.println("��� ��� �� = " + methodSyntax.sum(1, 1));
		// ����� ������ ���뼺�� ������ ������ �ְ� �ƴϸ� �ٷ� ��� �ϴ°� ������?

        System.out.println("\n=========================");
        String name = methodSyntax.getName();
        System.out.println("Field ���� name = " + name);
        // System.out.println("Field ���� name = " + methodSyntax.getName());
        
        System.out.println("\n=========================");
        String add = methodSyntax.getAdd();
        System.out.println("Field ���� add = " + add);
        // System.out.println("Field ���� add = " + methodSyntax.getAdd());

        System.out.println("\n=========================");
        String [] info = methodSyntax.getAlllnformation();
        System.out.println("field ���� ��� ��� ");
        for (int i = 0; i < info.length; i++) {
		// for(int i =0; i< 2 ; i++){ // info.length���� ������ -> ���ڰ��� �� �߰��ɰ�� ���̿� ���� �������� ������ �ؾ������� .length�� ��������� info�� ���̸� �ڵ����� �˾Ƴ���.
            System.out.println((i+1)+"��° ���� = "+ info[i]);
        }
        

    }
}