package keyBoardInput;

import java.util.Scanner;

public class MultipleInputKeyBoard_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		String name = sc.next();
		
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter the phone number : ");
		long phn = sc.nextLong();
				
		System.out.println("Enter the gender - Male : ");
		boolean gen = sc.nextBoolean();
		
		System.out.println("Enter the Uknown value : ");
		Object ob = sc.next();
		
		System.out.println("Entered Name : "+name);
		System.out.println("Entered age : "+age);
		System.out.println("Entered phone : "+phn);
		System.out.println("Entered Gender : "+gen);
		System.out.println("Entered unknown data : "+ob);
	}

}
