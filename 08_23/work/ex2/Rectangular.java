public class Rectangular extends Shape{
	//Field
	private double width;
	private double hight;
	
	//Consturctor
	public Rectangular(String name, double width, double hight){
		super.setName(name);
		setWidth(width);
		setHight(hight);
	}

	//setter
	public void setWidth(double width){
		this.width = width;
	}
	public void setHight(double hight){
		this.hight = hight;
	}
	//getter
	public double getWidth(){
		return width;
	}
	public double getHight(){
		return hight;
	}

	//Method
	public void calculationArea(){
		super.area = getWidth() * getHight();
	}
}