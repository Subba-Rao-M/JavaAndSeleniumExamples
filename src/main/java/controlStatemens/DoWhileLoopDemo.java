package controlStatemens;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
	//Example Print 1 to 10
		
		int i = 1; // Initialization
		
		do{ 
			System.out.println("value of i "+i); // Statement
			i++; //Increment operator
		}while (i<=10);//Condition
		
		
		//Example 2: Display the value 10 to 1 in decrement order
		
				int e = 10;
				
				 do {
					System.out.println("value is "+e);
					e--;
				}while(e>=1);

	}

}
