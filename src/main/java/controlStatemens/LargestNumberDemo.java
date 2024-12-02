package controlStatemens;

public class LargestNumberDemo {

	public static void main(String[] args) {
		int a= 300, b=29, c=310;
		
		if(a>b && a> c) {
			System.out.println("A is largest number "+a);
		}
		else if(b>a && b> c) {
			System.out.println("B is largest number "+b);
		}
		
		else {
			System.out.println("C is largest number "+c);
		}

	}

}
