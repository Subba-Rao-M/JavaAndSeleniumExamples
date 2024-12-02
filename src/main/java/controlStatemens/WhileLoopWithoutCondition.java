package controlStatemens;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		
		int i=1;
		while(true) { //infinite loop
			System.out.println("Hello"); 
			i++;
			if(i==10)
				break;
		}

	}

}
