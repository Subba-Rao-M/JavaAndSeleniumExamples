package keyBoardInput;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingValuesForArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<a.length; i++) {
			
			System.out.println("Enter the value for positin "+i+" : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array value received : "+Arrays.toString(a));

	}

}
