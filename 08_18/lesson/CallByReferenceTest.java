//package jp01.part02;

public class CallByReferenceTest {

	///Field
	int number = 100;

	public void referenceChange(CallByReferenceTest value) {
		System.out.println("============================");
		value.number = 100 + value.number;
		System.out.println("value : "+value.number);
		System.out.println("============================");
	}

	public static void main(String[] args) {
		CallByReferenceTest call = new CallByReferenceTest();

		call.referenceChange(call);
		System.out.println("number : "+call.number);
	}
}
