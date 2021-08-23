//package jb05.part03;

class TopSecret02 {
	///Field
	int secretNo = 7777;

	///Constructor
	public TopSecret02() {
	}

	public int getSecreNo(int pwd) {
		if (pwd == 0) {
			return secretNo;
		} else {
			return 0;
		}
	}
}

public class  ModifierTest02 {
	public static void main(String[] args) {

		TopSecret02 top = new TopSecret02();
		//System.out.println(top.secretNo);
		//top.secretNo = 1234;
		
		System.out.println(top.getSecreNo(0));
	}
}
