
public class Circle extends Shape{
	public double radius;
	
	public Circle(String color , double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Circle() {
		super();
		this.radius = 0;
	}
	 
	@Override
	public double getArea() {
		double area = Math.PI * (radius * radius);
	      return area;
	   }
	@Override
	 public String toString() {
	      return "Circle["+"radius="+ radius + "," + super.toString();
	   }
	
	public double getArea(double radius) {
		this.radius = radius;
		double area = Math.PI * (radius * radius);
	      return area;
	   }
	
	
}
//Jeffrey Amaga Phillips
//6787094
//section 1