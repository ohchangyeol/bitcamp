public class Bank02{

	//Field
	String $userName,
		$bankName;
	int $tmep,
		$command,
		$money;

	

	//constructor
	public Bank02(){ // Instance �� ������
	}
	public Bank02(String name, String bank){ 
		$userName = name;
		$bankName = bank;
	}
	public Bank02(String name, String bank,int inOut, int money){ 
		$userName = name;
		$bankName = bank;
		$command = inOut;
		$money = money;
	}

	//method
	public void currentBalance () {
		int balance =deposit(); // 
		if (balance != 0){
			System.out.println("���� "+balance+"�� �ֽ��ϴ�.");
		}else{
			System.out.println("���� �ݾ��� "+balance+"�� �Դϴ�.");
		}
	}

	public int deposit(){
	//public deposit (){ // invalid method declaration; return type required => return ���� ���� ������Ÿ���� ���������ʾҾ�. return���� ���� ������Ÿ���� ������ ��������.
		if ($command == 1 || $command == 2){ // args[2]�� 1 or 2 ���� ��ȿ���˻�.
			if ($command == 1){
				$tmep += $money;
				System.out.println($tmep+"�� �Ա� �Ͽ����ϴ�.");
				return $tmep;
			}else{
				$tmep -= $money;
				System.out.println($tmep+"�� ��� �Ͽ����ϴ�.");
				return $tmep;
			}
		}

		System.out.println("3��° ���ڰ��� �Ա� 1, ��� 2 �� �Է����ּ���.");
		return $tmep;
	}

	/* // �̷��� �غôµ�  ��� ���̵ι� ���´�. �׷��ٰ� ȣ�⸸���� ���⿡ �������� �����ʴ�.
	public void displayMoney() {
		int temp = deposit();
		if(temp != 0){
			System.out.println("���� " + temp + "�� �ֽ��ϴ�.");
		}
	}
	*/
	// main
	public static void main (String args[]) {
		
		//Bank02 bank;
		//System.out.println(bnak); bank�� �ʱ�ȭ �����ʾҴ�. �ʱⰪ�� �ֱ����� field �� ���� �־��ְų�, �� method�� �־� ����.
		if ( args.length == 0 || args.length % 2 != 0 || args.length > 5 ){
			System.out.println("[usage]::java Bank [���� �̸�]\t[�ְŷ�����]\t[�Ա� : 1,��� : 2]\t[�ݾ�]");
            System.out.println("[usage]:: ���ڰ��� �ּ� 2��, ���Դ� 4���� �ʿ��մϴ�.");
			System.exit(0);
		}
		Bank02 bank = new Bank02();
		System.out.println("\'" + args[0] + "\'���� �ְŷ������� \'" + args[1] + "\' �Դϴ�.");
		
		switch (args.length){
		case 2 : 
			bank = new Bank02(args[0],args[1]);
			break;
		case 4 : // �̰��� ���� ������µ� no suitable constructor found for Bank02(String,String,String,String) ��� error �� ���Դ�. ������ constructor�� ���������ʾұ� ������ ������ error �������̴�..
			bank = new Bank02(args[0],args[1],Integer.parseInt(args[2]),Integer.parseInt(args[3]));
			//bank.deposit(); // ���� �갡 ���� �־�� �ұ�?
			break;
		default : 

		}
		
		bank.currentBalance();
		
		

	}//main

}//class