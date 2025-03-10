public class ShapeTester {
	   public static void main(String[] args) {
	      Shape s1 = new Rectangle("red", 4, 5);  
	      System.out.println(s1);  // Run Rectangle's toString()
	      System.out.println("Area is " + s1.getArea());  // Run Rectangle's getArea()
	      
	      Shape s2 = new Triangle("blue", 4, 5);  
	      System.out.println(s2);  // Run Triangle's toString()
	      System.out.println("Area is " + s2.getArea());  // Run Triangle's getArea()
	      
	      Shape s3 = new Shape("blue");  // Upcast
	      System.out.println("--Test superclass method--");
	      System.out.println(s3);  // Run Triangle's toString()
	      System.out.println("Area is " + s3.getArea());  // Run Triangle's getArea()
	      
	      Rectangle s4 = new Rectangle();  // Upcast
	      s4.setColor("green");
	      System.out.println("--Test overload method--");
	      System.out.println("Area is " + s4.getArea(5.0, 10.0));  // Run Rectangle's getArea()
	      System.out.println(s4);  // Run Rectangle's toString()
	     
	      Triangle s5 = new Triangle();  // Upcast
	      s5.setColor("yellow");
	      System.out.println("--Test overload method--");
	      System.out.println("Area is " + s5.getArea(5.0, 10.0));  // Run Triangle's getArea()
	      System.out.println(s5);  // Run Triangle's toString()
	      
	      //challenge
	      System.out.println();
	      System.out.println("------------------------Challenge------------------------");
	      Circle s6 = new Circle("red",5);
	      System.out.println(s6);
	      System.out.println("Area is " + s6.getArea());
	      
	      System.out.println();
	      Circle s7 = new Circle();
	      s7.setColor("beige");
	      System.out.println("--Test overload method--");
	      System.out.println("Area is " + s7.getArea(10.0));
	      System.out.println(s7);
	      
	      
	   }
	}

//Jeffrey Amaga Phillips
//6787094
//section 1