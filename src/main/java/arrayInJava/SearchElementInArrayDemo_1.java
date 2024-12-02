package arrayInJava;

public class SearchElementInArrayDemo_1 {

	public static void main(String[] args) {
		/**********
		 * Search element in an array using linear search
		 * Get the value from array, compare with search criteria and if matches exit the loop
		 * Only first time matching data is considered, duplicate value is not considered
		 */
		
		
		int a[] = {10, 20, 30, 40, 50};
		int searhNumber = 30;
		boolean status = false;
		
		for(int i=0; i<a.length; i++) {
		
			if(a[i]==searhNumber) {
				System.out.println("Element found");
				status = true;
				break;
			}	
		}
		
		if (status ==false)
		System.out.println("Element Not Found"); // Always for loop executes this to avoid create a boolean flag and add condition to display
	}
	
	
	

}
