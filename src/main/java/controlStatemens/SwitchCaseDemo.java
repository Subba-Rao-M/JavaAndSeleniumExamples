package controlStatemens;

public class SwitchCaseDemo {
	/***
	 * If more number of if and else conditions go for Switch statement
	 * It will reduce the number of lines code and helps in achieving the target with minimal code for conditions
	 * If break is not specified in case statement it will execute next statements
	 * break statement will make the flow to come out of switch statement
	 * default is last line of code and will not have break command
	 * @param args
	 */

	public static void main(String[] args) {
		int weekno = 10;
		
		switch(weekno) {
		case 1 : System.out.println("Monday"); break;
		case 2 : System.out.println("Tuesday"); break;
		case 3 : System.out.println("Wednsday"); break;
		case 4 : System.out.println("Thursday"); break;
		case 5 : System.out.println("Friday"); break;
		case 6 : System.out.println("Saturday"); break;
		case 7 : System.out.println("Sunday"); break;
		default : System.out.println("Enter valid week number");
		}

	}

}
