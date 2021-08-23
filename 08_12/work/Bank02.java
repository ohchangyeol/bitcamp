public class Bank02{

	//Field
	String $userName,
		$bankName;
	int $tmep,
		$command,
		$money;

	

	//constructor
	public Bank02(){ // Instance 를 했을때
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
			System.out.println("현재 "+balance+"원 있습니다.");
		}else{
			System.out.println("현재 금액은 "+balance+"원 입니다.");
		}
	}

	public int deposit(){
	//public deposit (){ // invalid method declaration; return type required => return 받을 값의 데이터타입이 지정되지않았어. return받을 값의 데이터타입의 유형을 적어주자.
		if ($command == 1 || $command == 2){ // args[2]가 1 or 2 인지 유효성검사.
			if ($command == 1){
				$tmep += $money;
				System.out.println($tmep+"원 입금 하였습니다.");
				return $tmep;
			}else{
				$tmep -= $money;
				System.out.println($tmep+"원 출금 하였습니다.");
				return $tmep;
			}
		}

		System.out.println("3번째 인자값에 입금 1, 출금 2 를 입력해주세요.");
		return $tmep;
	}

	/* // 이렇게 해봤는데  결과 값이두번 나온다. 그렇다고 호출만으로 쓰기에 가독성이 좋지않다.
	public void displayMoney() {
		int temp = deposit();
		if(temp != 0){
			System.out.println("현재 " + temp + "원 있습니다.");
		}
	}
	*/
	// main
	public static void main (String args[]) {
		
		//Bank02 bank;
		//System.out.println(bnak); bank가 초기화 되지않았다. 초기값을 넣기위해 field 에 직접 넣어주거나, 빈 method를 넣어 하자.
		if ( args.length == 0 || args.length % 2 != 0 || args.length > 5 ){
			System.out.println("[usage]::java Bank [너의 이름]\t[주거래은행]\t[입금 : 1,출금 : 2]\t[금액]");
            System.out.println("[usage]:: 인자값이 최소 2개, 많게는 4개가 필요합니다.");
			System.exit(0);
		}
		Bank02 bank = new Bank02();
		System.out.println("\'" + args[0] + "\'님의 주거래은행은 \'" + args[1] + "\' 입니다.");
		
		switch (args.length){
		case 2 : 
			bank = new Bank02(args[0],args[1]);
			break;
		case 4 : // 이것을 먼저 만들었는데 no suitable constructor found for Bank02(String,String,String,String) 라는 error 가 나왔다. 적합한 constructor를 지정하지않았기 때문에 나오는 error 였던것이다..
			bank = new Bank02(args[0],args[1],Integer.parseInt(args[2]),Integer.parseInt(args[3]));
			//bank.deposit(); // 굳이 얘가 여기 있어야 할까?
			break;
		default : 

		}
		
		bank.currentBalance();
		
		

	}//main

}//class