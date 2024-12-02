package controlStatemens;

public class BreakStatementDemo {
	
	public static void main(String[] args) {
		//Example1: Print 1 to 10

		for(int i=1; i<=10; i++) {
			if(i==5) {
				break; // It will break the entire loop and further statement will not be executed in for loop
			}
			System.out.println("Value of i is "+i);
		}
	}

}
