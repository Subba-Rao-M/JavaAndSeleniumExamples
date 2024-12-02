package methodsDemo;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greetings gr = new Greetings(); // gr is instance of Greetings class
		gr.m1(); // Calls m1 method without any parameter and no values returned back
		
		String message = gr.m2();
		System.out.println(message);
		
		gr.m3("Subba Rao");
		
		String message1 = gr.m4("Subba Rao");
		System.out.println(message1);
	}

}
