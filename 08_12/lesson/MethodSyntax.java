public class MethodSyntax {
	/*
		���ڰ���, return ����.
	*/

	//field 
    String name = "ȫ�浿";
    String add = "�Ѿ�";
    
	//method
    public void browerOn(){
        System.out.println("brower�� �Ѵ�");
    }

    public boolean documentWork(){
        System.out.println("document �۾� �ϰ� �۾� �ϼ� ������ boolean return");
        return true;
    }
    public int sum(int i,int j){
        System.out.println("<<"+i+">> �� <<"+j+">> ���� �޾ƾ� �մϴ�.");
        return (i + j);
    }

    public String getName() {
        System.out.println("�̸��� �����մϴ�.");
        return name;
    }
    public String getAdd() {
        System.out.println("�ּ� ����");
        return add;
    }
    public String [] getAlllnformation(){
        String [] str = {name, add};
        return str;
    }
}
