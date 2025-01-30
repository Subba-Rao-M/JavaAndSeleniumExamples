package controlStatemens;

public class NestedForLoop_Demo_1{

	public static void main(String[] args) {
		//nested loops works -
		//Print the numbers in format 1 2  3 4 
		//								5 6 7
		//								8 9
		//								10
		int k=1;
		for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
		{
		System.out.println( "outer loop started");
		for(int j=1;j<=4-i;j++) // inner loop
		{
		System.out.print( k); //ln removal will print in same line
		System.out.print("\t");
		k++;
		}
		System.out.println("");
		}
		}

	

}
