import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WordCounter {
	
	public void counter(String text) {
		
		Set<String> word = new LinkedHashSet<>(Arrays.asList(text.split(" ")));
		
		
		for(String s : word) {
			
			System.out.println(s);
		}
	}
}
