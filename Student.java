
public class Student {
	
	private String name;
	private int score;
	
	public Student(String name , int score)
	{
		this.name = name;
		this.score = score;
		
	}
	

	public String toString() {
		return "ชื่อ: " + name + " , " + "คะแนน: " + score;
	}
}
