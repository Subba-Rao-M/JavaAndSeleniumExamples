package methodsDemo;

public class Greetings {
	
	// No param and No ret value
	// void indicates method does not return any value
	
	void m1(){
		System.out.println(" M1 Method - No param and No ret value");
	}

	// No param and No ret value
	//  add return type based on type of data returned example int, String, boolean, etc
	String m2(){
		System.out.println(" M2 Method - No param and ret value");
		return ("return value from M2");
	}
	
	// Takes param and no ret value
	
	void m3(String name){
		System.out.println(" M3 Method - Take param and No ret value");
		System.out.println(" Hello...."+name);
	}
	
	
	// Takes param and ret value
	
		String m4(String name){
			System.out.println(" M4 Method - Take param and ret value");
			return (" Hello...."+name);
		}
		
	

}
