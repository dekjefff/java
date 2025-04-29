import java.util.*;
import java.util.Map.Entry;
public class JobApplication {
	private static Set<String> skills = new HashSet<String>(Arrays.asList("Java","HTML5","CSS3"));
	private static Map<String, Set<String>> applicants = new HashMap<String, Set<String>>();
	private static Map<String, Set<String>> applicantsSkillRequest = new HashMap<String, Set<String>>();
	
	public static void main(String[] args) {
		//------Task1------//
		System.out.println("Task 1: create and show applicants");
		createApplicants();
		//------Task2------//
		System.out.println("Task 2: findApplicantsWithMatchSkills");
		findApplicantsWithMatchSkills();
		//------Task3------//
		System.out.println("Task 3: allApplicantsSkills");
		allApplicantsSkills();
		
		System.out.println("Task Challenge: allApplicantsSkills");
		
		Set<String> Samskills = new HashSet<String>(Arrays.asList("C++", "Ruby","CSS3"));
		Set<String> Steveskills = new HashSet<String>(Arrays.asList("C","Java","HTML5"));
		
		applicantsSkillRequest.put("Sam", Samskills);
		applicantsSkillRequest.put("Steve", Steveskills);
		ApplicantsMacthSkill("Game");
		
		
	}
	
	public static void createApplicants() {
		//----------------YOUR CODE HERE--------------//
		
		
		Set<String> Peterskills = new HashSet<String>(Arrays.asList("C++", "Ruby"));
		Set<String> Aumskills = new HashSet<String>(Arrays.asList("C#","Java"));
		Set<String> Tipskills = new HashSet<String>(Arrays.asList("Java","CSS3","HTML5"));
		Set<String> Janeskills = new HashSet<String>(Arrays.asList("HTML5","Ruby","Java","CSS3"));

		applicants.put("Peter", Peterskills);
		applicants.put("Aum", Aumskills);
		applicants.put("Tip", Tipskills);
		applicants.put("Jane", Janeskills);
		
		for(Map.Entry<String, Set<String>> a : applicants.entrySet()) {
			
			String name = a.getKey();
			Set<String> appskill = a.getValue();
			
			System.out.println(name + " => " + appskill);
			
		}
	}
	
	public static void findApplicantsWithMatchSkills() { 
		//----------------YOUR CODE HERE--------------//
		for(Map.Entry<String, Set<String>> a : applicants.entrySet()) {
			
			String name = a.getKey();
			Set<String> appskill = a.getValue();
			
			if(appskill.containsAll(skills)) {
				
				System.out.println(name + " => " + appskill);
				
			}
			
		}
		
		
	
	}
	public static void allApplicantsSkills() {
		//----------------YOUR CODE HERE--------------//
		Set<String> Peterskills = new HashSet<String>(Arrays.asList("C++", "Ruby"));
		Set<String> Aumskills = new HashSet<String>(Arrays.asList("C#","Java"));
		Set<String> Tipskills = new HashSet<String>(Arrays.asList("Java","CSS3","HTML5"));
		Set<String> Janeskills = new HashSet<String>(Arrays.asList("HTML5","Ruby","Java","CSS3"));

		
		Set<String> allskills = new HashSet<String>();
		allskills.addAll(Peterskills);
		allskills.addAll(Aumskills);
		allskills.addAll(Tipskills);
		allskills.addAll(Janeskills);
		
		System.out.println("all applicants' skills " + allskills);
}

	public static void ApplicantsMacthSkill(String position) {
		Set<String> Application  = new HashSet<String>(Arrays.asList("C","Java"));
		Set<String> Game = new HashSet<String>(Arrays.asList("C++"));
		Set<String> Web = new HashSet<String>(Arrays.asList("HTML5","Ruby","CSS3"));
		
		if(position.equals("Game")) {
			
			for(Map.Entry<String, Set<String>> a : applicantsSkillRequest.entrySet()) {
				
				String name = a.getKey();
				Set<String> skill = a.getValue();
				
				if(hasCommonElement(Game, skill)) {
					System.out.println(name + " Have the requested skill");
				}else {
					  System.out.println(name + " is no requested skill.");
				}
	
			}	
				
		}
		
		if(position.equals("Web")) {
			
			for(Map.Entry<String, Set<String>> a : applicantsSkillRequest.entrySet()) {
				
				String name = a.getKey();
				Set<String> skill = a.getValue();
				
				if(hasCommonElement(Web, skill)) {
					System.out.println(name + " Have the requested skill");
				}else {
					  System.out.println(name + " is no requested skill.");
				}
	
			}	
				
		}
		
		if(position.equals("Application")) {
			
			for(Map.Entry<String, Set<String>> a : applicantsSkillRequest.entrySet()) {
				
				String name = a.getKey();
				Set<String> skill = a.getValue();
				
				if(hasCommonElement(Application, skill)) {
					System.out.println(name + " Have the requested skill");
				}else {
					  System.out.println(name + " is no requested skill.");
				}
	
			}	
				
		}
		
	}
	
	public static boolean hasCommonElement(Set<String> set1, Set<String> set2) {
	    for (String s : set2) {
	        if (set1.contains(s)) {
	            return true;
	        }
	    }
	    return false;
	}
}
	

