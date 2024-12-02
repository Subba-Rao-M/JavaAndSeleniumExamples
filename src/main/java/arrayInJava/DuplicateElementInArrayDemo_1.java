package arrayInJava;

public class DuplicateElementInArrayDemo_1 {

	public static void main(String[] args) {
		
		// FInd the number of repitations in an array
		
		int a[] = {10, 20, 20, 10, 30, 40, 40, 50, 30, 20, 30};
		int searhNumber = 30;
		int count = 0;
		
		for(int value: a) {
		
			if(value==searhNumber) {
				count++;
				
			}	
		}
		System.out.println("Total number "+count+" of times "+searhNumber+" is repeated"); 
	}
	
	
	

}
