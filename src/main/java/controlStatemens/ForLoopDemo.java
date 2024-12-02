package controlStatemens;

public class ForLoopDemo {

	public static void main(String[] args) {
		//Example1: Print 1 to 10

		for(int i=1; i<=10; i++) {
			System.out.println("Value of i is "+i);
		}


		//Example2: Print 10 to 1

		for(int i=10; i>=1; i--) {
			System.out.println("Value of i is "+i);
		}

		//Example 3 = Print even numbers between 1 to 10

		for(int i=2; i<=10; i+=2) {
			System.out.println("Value of Even Number i is "+i);
		}


		//Example 4: Print 1 to 10 with even or odd number



		for(int i = 1; i<=10; i++)
		{
			if(i%2==0) {
				System.out.println(i+" Even Number");
			}
			else {
				System.out.println(i+" Odd Number");
			}
		}


	}

}
