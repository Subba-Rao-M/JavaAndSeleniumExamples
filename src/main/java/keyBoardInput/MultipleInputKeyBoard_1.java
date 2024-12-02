package keyBoardInput;

import java.util.Scanner;

public class MultipleInputKeyBoard_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Sum of 2 numbers : "+(num1+num2));
		sc.close();
	}

}
