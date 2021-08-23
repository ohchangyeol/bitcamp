// FileName : Test1.java

public class Test1 {
	//내가 어떻게 이해 했는지 주석문 달기.
    public static void main(String args []) {
        String name = args[0]; // 데이터 타입이 String인 args(아구먼트)을 받아 변수에 대입한다.
        String hp = args[1];

        System.out.println("나의 이름은 \""+name+"\"입니다."); 
			/* ""이라는 키워드안에  \(escape)" 지정된 특수문자를 입력하고 +(appand) 변수 + ""키워드*/
        System.out.println("\""+name+"\"씨의 [hp]는 \""+hp+"\"입니다.");
    }
}
