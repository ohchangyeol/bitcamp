public class MethodSyntax {
	/*
		인자값과, return 배우기.
	*/

	//field 
    String name = "홍길동";
    String add = "한양";
    
	//method
    public void browerOn(){
        System.out.println("brower를 켜다");
    }

    public boolean documentWork(){
        System.out.println("document 작업 하고 작업 완성 유무를 boolean return");
        return true;
    }
    public int sum(int i,int j){
        System.out.println("<<"+i+">> 와 <<"+j+">> 값을 받아야 합니다.");
        return (i + j);
    }

    public String getName() {
        System.out.println("이름을 전달합니다.");
        return name;
    }
    public String getAdd() {
        System.out.println("주소 전달");
        return add;
    }
    public String [] getAlllnformation(){
        String [] str = {name, add};
        return str;
    }
}
