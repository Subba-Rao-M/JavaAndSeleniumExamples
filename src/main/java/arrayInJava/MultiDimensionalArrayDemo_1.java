package arrayInJava;

public class MultiDimensionalArrayDemo_1 {

	public static void main(String[] args) {
		
		// Approach 1
		
		//Declare array
		int a[][]	= new int [3][2];
		
		//Assign Values
		//1st row
		a[0][0] = 100;
		a[0][1] = 101;
		
		//2nd row
		a[1][0] = 200;
		a[1][1] = 201;
		
		//3rd row
		a[2][0] = 300;
		a[2][1] = 301;
		

		//Find length or rows
		
		System.out.println(" Number of rows  "+a.length);
		
		//Find number of columns 
		
		System.out.println(" Number of columns  "+a[0].length);
		
		// Read single value from array
		
		System.out.println(" Single value reading from array  "+a[0][1]);
		
		
		for (int r = 0; r<=a.length-1; r++) { // 0, 1, 2
			
			for (int c=0; c<=a[r].length-1; c++) { // 0, 1 for row 0, 0, 1 for row 1 and 0, 1 for row 2
				
				System.out.print(a[r][c]+" "); // 100, 101, .................
			}
			System.out.println();
			
		}
		
		
		
		
	}
}
