class FindOddException extends Exception{
	//Field 

	//consturctor
	public FindOddException(){
		System.out.println("==> FindOddException Default Constructor");
	}
	public FindOddException(String msg){
		super(msg);
		System.out.println("==> FindOddException Default Constructor");
	}

}// end of class


public class FindOddExceptionTest{
	//Field
	
	//consturctor
	public FindOddExceptionTest(){
	}

	//method
	public void test(int number) throws FindOddException{
		System.out.println(":: "+ this.getClass().getName()+" strat...\n");

		if(number % 2 == 0){
			System.out.println("�Է� �Ͻ� �� : "+ number);
		}else{
			throw new FindOddException();
		}
		System.out.println(":: "+ this.getClass().getName()+" end...\n");
	}

	//Main method
	public static void main(String[] args){
		FindOddExceptionTest met = new FindOddExceptionTest();
		try {
			met.test(10);
			met.test(11);
		} catch (FindOddException e) {
			System.out.println("\n e : "+ e);
		}
	}
}