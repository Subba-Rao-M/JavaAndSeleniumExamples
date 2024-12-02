package arrayInJava;

public class SingleDimensionalArrayDemo1 {

	public static void main(String[] args) {
		
		/*//Approach 1
		// Declare array
		 * If you know the size of array and dont want to add data in future for for this approach
		
		int a[] = new int[5]; 
		
		// Add values to array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		*/
		
		// Approach 2 Declare and assign values to array in single line
		//If you dont know the values which are going to be added in future go for this approach
		// Memory location will be updated on adding or removing values to array
		
		int a[] = {100, 200, 300, 400, 500};
		
		// Find length of array to know how many values stored
		System.out.println("Lenth of array "+a.length);
		
		// Read value from array for specific location
		
		System.out.println("Value of array data in 1st place "+a[0]);
		System.out.println("Value of array data in 2nd place "+a[1]);
		
		// To read all values from array using looping statement
		
		for (int i =0; i< a.length; i++) {
			System.out.println("For loop running for a["+i+"] "+a[i]);
		}
		
		// Enhanced for loop or called for each loop
		
		for (int x: a) {
			System.out.println(" # Execution from for each loop : "+x);
		}
	}

}
