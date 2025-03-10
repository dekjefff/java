
public class Triangle extends Shape {
	public double base;
	public double height;
	
	public Triangle(String color , double base , double height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public Triangle() {
		super();
		this.base = 0;
		this.height = 0;
	}
	
	public void setArea(double base , double width) {
		this.base = base;
		this.height = width;
	}
	@Override
	public double getArea() {
		double area = 0.5*(base * height);
	      return area;
	   }
	@Override
	 public String toString() {
	      return "Rectangle["+"length="+ base +" , height="+ height + "," + super.toString();
	   }
	
	public double getArea(double base , double height) {
		this.base = base;
		this.height =height;
		double area =  0.5*(base * height);
	      return area;
	   }
}
//Jeffrey Amaga Phillips
//6787094
//section 1