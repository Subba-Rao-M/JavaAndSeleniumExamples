package controlStatemens;

public class ContunueStatementDemo {

	public static void main(String[] args) {
		//Example1: Print 1 to 10

		for(int i=1; i<=10; i++) {
			if(i==5  || i==3 || i ==9) {
				continue; // It will skip the value for above condition and move to increment part
			}
			System.out.println("Value of i is "+i);
		}
	}

}
