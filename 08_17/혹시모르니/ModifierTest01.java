//package jb05.part03;

class TopSecret01 {
	///Field
	int secretNo = 7777;

	///Constructor
	public TopSecret01() {
	}

	public int getSecreNo() {
		return secretNo;
	}
}

public class  ModifierTest01 {
	public static void main(String[] args) {

		TopSecret01 top = new TopSecret01();
		System.out.println(top.secretNo);

		top.secretNo = 1234;
		System.out.println(top.getSecreNo());
	}
}
