package controlStatemens;

public class NestedForLoop_Demo{

	public static void main(String[] args) {
		for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
		{
		System.out.println( "outer loop started");
		for(int j=0;j<=4;j++) // inner loop
		{
		
			System.out.println(j);
		}
		System.out.println(i);
		}
		}

	

}
