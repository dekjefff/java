
public class Main {

	public static void main(String[] args) {

		

		System.out.println(CountChar("banana", 'a'));
	}

	
	public static int CountChar(String word , char c) {
		
		return CountCharHelper(word , c , 0 , 0);
		
	}
	
	public static int CountCharHelper(String word , char c , int index , int count) {
		
		if(index >= word.length()) return count;
		
		if(word.charAt(index) == c) {	
			count++;
		}
		
		return CountCharHelper(word , c , index + 1 , count);
	}
}
