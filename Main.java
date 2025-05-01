
public class Main {

	public static void main(String[] args) {
		System.out.println(reverse("hello"));
		System.out.println(reverse("Java123"));

	}
	
	public static String reverse(String s) {
		
		if(s.isEmpty()) {
			
			return s;
		}
		
		return reverse(s.substring(1)) + s.charAt(0);
		
	}
	
	
}
