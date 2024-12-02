package arrayInJava;

public class SearchElementInArrayDemo_2 {

	public static void main(String[] args) {
		
		
		int a[] = {10, 20, 30, 40, 50};
		int searhNumber = 30;
		boolean status = false;
		
		for(int x: a) {
		
			if(x==searhNumber) {
				System.out.println("Element found");
				status = true;
				break;
			}	
		}
		
		if (status ==false)
		System.out.println("Element Not Found"); // Always for loop executes this to avoid create a boolean flag and add condition to display
	}
	
	
	

}
