//package jb05.part03;

class TopSecret03 {
	///Field
	int secretNo = 7777;

	///Constructor
	private TopSecret03() {
	}

	public int getSecreNo(int pwd) {
		if (pwd == 0) {
			return secretNo;
		} else {
			return 0;
		}
	}

	public static TopSecret03 getInstance() {
		TopSecret03  top = new TopSecret03();
		return top;
	}
}

public class  ModifierTest03 {
	public static void main(String[] args) {

		//생성자가 private로 instance 생성 불가능 
		//TopSecret03 top = new TopSecret03();
		
		//instance 생성 불가로 static method를 통해 객체를 return
		TopSecret03  top = TopSecret03.getInstance();
		System.out.println(top.getSecreNo(0));
	}
}
