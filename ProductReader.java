import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProductReader {
	
	public void stockReader(String filename) {
		
		String line;
		int  count = 0;
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
			
			while((line = reader.readLine()) != null) {
				
				count++;
				System.out.println(line);
			}
			
			System.out.println("จำนวนสินค้าทั้งหมด: " + count + " ชิ้น");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
