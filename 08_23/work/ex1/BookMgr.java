public class BookMgr{
	//Field
	private Book[] booklist;
	//consturctor
	public BookMgr(){}
	public BookMgr(Book[] array){
		this.booklist = array;
	}

	//method
	public void printBooklist(){
		for(int i = 0 ; i < booklist.length ; i++){
			System.out.println(booklist[i].getTitle());
		}
	}
	public void printTotalPrice(){
		int sum = 0;
		for (int i = 0 ; i < booklist.length ; i++){
			sum += booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+sum);
	}
}