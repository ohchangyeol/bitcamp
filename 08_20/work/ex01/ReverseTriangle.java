class ReverseTriangle{
	//Field
	private int inputInt;

	//Constructor
	public ReverseTriangle(int inputInt){
		this.inputInt = inputInt;
		validation(inputInt);
	}

	//유효성 검사
	void validation(int inputInt){
		if (0 > inputInt || inputInt % 2 == 0 ){
			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
			return;
		}else {
			createTriangle();
		}
	}
	//method
	void createTriangle () {
		for (int i = 0 ; i < inputInt ; i++){
			String sum ="";
			for (int j = i ;j < i*2 ; j++){
				sum += " ";
			}
			for (int k = i ; k < inputInt ;k++ ){
				sum += "*";
			}
			inputInt--;
			System.out.println(sum);
		}
	}
}