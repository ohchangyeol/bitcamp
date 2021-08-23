//package jb05.part03;

final class TopSecret04 {
	///Field
	private final int secretNo = 7777;

	///Constructor
	private TopSecret04() {
	}

	public int getSecreNo(int pwd) {
		if (pwd == 0) {
			return secretNo;
		} else {
			return 0;
		}
	}

	public static TopSecret04 getInstance(int managerNo) {
		if (managerNo == 1234) {
			return new TopSecret04();
		} else {
			return null;
		}
	}
}

public class  ModifierTest04 {
	public static void main(String[] args) {

		//생성자가 private로 instance 생성 불가능 
		//TopSecret03 top = new TopSecret03();
		
		//instance 생성 불가로 static method를 통해 객체를 return
		TopSecret04  top = TopSecret04.getInstance(1234);
		System.out.println(top.getSecreNo(0));
	}
}
