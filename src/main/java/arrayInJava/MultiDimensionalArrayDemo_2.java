package arrayInJava;

public class MultiDimensionalArrayDemo_2 {

	public static void main(String[] args) {
		//Approach 2
		
		int [][]a = {
						{100, 101}, //1st row column
						{200, 201},  //2nd
						{300, 301} //3rd row
					};
		
		
		for(int arr[] : a) // arr [] single dimensional array variable which captures row data like 0, 1, 2
		{
			for(int x : arr) { // from above captured row values are retried and after all values it goes back to previous loop
				
				System.out.print(x+ " ");
			}
			System.out.println(); //to print the data in tabular format
		}

	}

}
