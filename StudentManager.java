import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class StudentManager {

	public static void main(String[] args) {
		
		Student[] student = new Student[3];
		student[0] = new Student("Alice" , 78);
		student[1] = new Student("Bob" , 82);
		student[2] = new Student("Charlie" , 92);
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("students.txt",true));
			
			for(Student s : student) {
				writer.write(s.toString());
				writer.newLine();
			}
		
			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(writer != null){
					writer.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
