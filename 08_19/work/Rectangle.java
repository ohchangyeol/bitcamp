/*
	beans
*/
public class Rectangle{
	//Field
	private int width;
	private int length;
	private String color;

	//Method
	
	public int area(){
		return width * length;
	}
	public int perimeter(){
		return (width*2) + (length *2);
	}
	
	//getter
	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
	}
	public String getColor(){
		return color;
	}
	//setter
	public void SetWidth(int width){
		this.width = width;
	}
	public void SetLength(int length){
		this.length = length;
	}
	public void SetColor(String color){
		this.color = color;
	}

}//class