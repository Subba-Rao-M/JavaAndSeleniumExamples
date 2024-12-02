package keyBoardInput;

import java.util.Scanner;

public class TakingInputFromKeyBoard {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num;
		
		System.out.println("Please enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//double num1 = sc.nextDouble();
		
		System.out.println("Received Number : "+num);
		
		
		System.out.println("Please enter your city : ");
		
		String city = sc.next(); // For string only next is used
		
		System.out.println("Entered city value is : "+city);
	}

}
