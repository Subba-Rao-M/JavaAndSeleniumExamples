package controlStatemens;

public class PrintWeeksNameDemo {

	public static void main(String[] args) {
		int weekno = 9;
		
		if(weekno==0) {
			System.out.println("Sunday");
		}
		else if(weekno==1) {
			System.out.println("Monday");
		}
		else if(weekno==2) {
			System.out.println("Tuesday");
		}
		else if(weekno==3) {
			System.out.println("Wednsday");
		}
		else if(weekno==4) {
			System.out.println("Thursday");
		}
		else if(weekno==5) {
			System.out.println("Friday");
		}
		else if(weekno==6) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Enter valid week number");
		}
		
	}

}
