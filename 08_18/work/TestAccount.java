/**
 * TestAccount
 */
class Account {
	
	//Field
	private String accNo;
	private int balance=0;

	// Constructor - ������
	public Account() {
		System.out.println("���°� �������� �ʾҽ��ϴ�.");
	}
	public Account(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " ���°� �����Ǿ����ϴ�.");
	}

	//Method
	public void save(int money) { // �Ա�
		this.balance += money;		
		System.out.println(accNo + " ���¿� " + money + "������ �ԱݵǾ����ϴ�.");
	}
	public void deposit(int money) { // ���
		this.balance -= money;
		System.out.println(accNo + " ���¿� " + money + "������ ��ݵǾ����ϴ�.");
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
		 System.out.println(accNo + " ������ �ܰ�� " + balance + "���� �Դϴ�.");

		 accObj.save(100);
		 balance = accObj.getBalance();
		 System.out.println(accObj.getAccNo() + " ������ �ܰ�� " + balance + "���� �Դϴ�.");

		 accObj.deposit(30);
		 balance = accObj.getBalance();
		 System.out.println(accObj.getAccNo() + " ������ �ܰ�� " + balance + "���� �Դϴ�.");
		 
	}
	
}

