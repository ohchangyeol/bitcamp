public class Book{
	//Field
	private String title;
	private int price;
	
	//Constructor
	public Book(){
	}
	public Book(String title){
		this.title = title;		
	}
	public Book(int price){
		this.price = price;
	}
	public Book(String title , int price){
		this(title);
		//this(price);
		this.price= price;
	}

	//setter
	public void setTitle(String title){
		this.title = title;
	}
	public void setPrice(int price){
		this.price = price;
	}

	//getter

	public String getTitle(){
		return title;
	}
	public int getPrice(){
		return price;
	}
}