public class Circle extends Shape{
	//Field
	private double radius;

	//Consturctor
	public Circle(String name, double radius){
		super(name);
		setRadius(radius);
	}
	//setter
	public void setRadius(double radius){
		this.radius = radius;
	}
	//getter
	public double getRadius(){
		return radius;
	}
	//Method
	public void calculationArea(){
		area = (getRadius()*getRadius()) * Math.PI;
	}
}
