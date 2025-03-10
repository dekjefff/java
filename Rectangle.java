
public class Rectangle extends Shape {
	public double lenght;
	public double width;
	
	public Rectangle(String color , double lenght , double width) {
		super(color);
		this.lenght = lenght;
		this.width = width;
	}
	
	public Rectangle() {
		super();
		this.lenght = 0;
		this.width = 0;
	}
	
	public void setArea(double lenght , double width) {
		this.lenght = lenght;
		this.width = width;
	}
	@Override
	public double getArea() {
		double area = lenght * width;
	      return area;
	   }
	@Override
	 public String toString() {
	      return "Rectangle["+"length="+ lenght +" , width="+ width + "," + super.toString();
	   }
	
	public double getArea(double lenght , double width) {
		this.lenght = lenght;
		this.width = width;
		double area = lenght * width;
	      return area;
	   }
}
//Jeffrey Amaga Phillips
//6787094
//section 1