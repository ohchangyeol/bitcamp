abstract class Shape{
	//Field
	protected double area;
	private String name;
	
	//Constructor
	public Shape(){}
	public Shape(String name){
		setName(name);
	}
	//setter
	public void setName(String name){
		this.name = name;
	}
	//getter
	public String getName(){
		return name;
	}
	//Method
	abstract void calculationArea();
	public void print(){
		System.out.println(getName()+"의 면적은 "+area);
	}
	
}