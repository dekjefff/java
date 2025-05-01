import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProductManager {

	public static void main(String[] args) {
		
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter("stoc.txt",true))){
//			
//			writer.write("Keyboard");
//			writer.newLine();
//			
//			writer.write("Mouse");
//			writer.newLine();
//			
//			writer.write("Monitor");
//			writer.newLine();
//			
//			writer.write("Webcam");
//		
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		ProductReader product = new ProductReader();
		
		product.stockReader("stoc.txt");
		

	}

}
