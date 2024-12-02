package exceptionHandling;



public class ExceptionDemo_4 {

	public static void main(String[] args) {
		String s = null;
		try {
		System.out.println(s.length()); //NullPointerException
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Program ended");

	}

}
