package exceptionHandling;

public class ExceptionDemo_3 {

	public static void main(String[] args) {
		String s = "Welcome";
		System.out.println("Program Started");
		int n = Integer.parseInt(s); // NumberFormatException
		try {
		System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		System.out.println("Program Ended");
		System.out.println("Program Exited");

	}

}
