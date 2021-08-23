/**
 * TestAccount
 */
class Account {
	
	//Field
	private String accNo;
	private int balance=0;

	// Constructor - 생성자
	public Account() {
		System.out.println("계좌가 개설되지 않았습니다.");
	}
	public Account(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}

	//Method
	public void save(int money) { // 입금
		this.balance += money;		
		System.out.println(accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
	}
	public void deposit(int money) { // 출금
		this.balance -= money;
		System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
	}
	public int getBalance() {
		return balance;		
	}
	// getter Method
	public String getAccNo() {
		return this.accNo;
	}
	
	
}
 public class TestAccount {
	public static void main(String[] args){
		 
		String accNo = null;
		int balance = 0 ;

		 Account accObj = new Account("078-3762-293");
		 accNo = accObj.getAccNo();
		 balance = accObj.getBalance();
		 System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원 입니다.");

		 accObj.save(100);
		 balance = accObj.getBalance();
		 System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원 입니다.");

		 accObj.deposit(30);
		 balance = accObj.getBalance();
		 System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원 입니다.");
		 
	}
	
}

