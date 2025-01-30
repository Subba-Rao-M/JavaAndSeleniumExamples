package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//Declaration
		
		ArrayList mylist = new ArrayList(); // To store heterogeneous data
		//List myList = new ArrayList(); // Valid since list is implemented by Arraylist
		//ArrayList <Integer>myList = new <Integer> ArrayList(); // To store homogeneous data
		// ArrayList <Employee>myList = new <Employee> ArrayList(); // Employee class object data to hold multiple emp objects
	
		//To add data to arraylist
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add(null);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(100);
		mylist.add(null);
	
		//To find the size of arraylist
		
		System.out.println(mylist.size());
		
		//To print the data from arraylist
		
		System.out.println(mylist); // Printing data in same order as it was entered
		
		//To remove element from array list using index option
		
		mylist.remove(2); //
		
		System.out.println("After removing element" +mylist);
		
		//To insert the value in between 2 values
		//Add data - element added one after another at the end of list
		//insert data- to add in the middle of list using overloading  option for add method
		
		mylist.add(2, "Subba");
		mylist.add(4, "R");
		System.out.println("After insertion of element" +mylist);
		
		//To modify/ replace or change the element at particular index
		mylist.set(2, "John");
		
		System.out.println("After replacing of element" +mylist);
	
		
		//To access/extract specific element from arraylist using get method and index value
		System.out.println("Extract element from list : " +mylist.get(3));
		
		//Contains test
		System.out.println("Contains Test : "+mylist.contains("Welcome"));
		
		//indexof
		System.out.println("Index of Test: "+mylist.indexOf("Welcome"));
		
		//Reading all the elements from arraylist
		
		//Approach 1 - using normal for loop
		
		for (int i = 0; i<=mylist.size()-1; i++ ) {
			System.out.println("Value of arraylist using normal loop: "+mylist.get(i));
			
		}
		
		
		//Approach 2 - using enhanced for loop or for each loop
		
		for(Object x : mylist) {
			System.out.println("Value of arraylist using enchanced for loop  : "+x);
			
		}
		
		
		//Approach 3 - using iterator which will work only with collections
		
		Iterator it = mylist.iterator(); // iterator method will return Iterator variable type of data
		
		//Iterator <String> it = mylist.iterator();  // If contains only string data
		//Iterator <Object> it = mylist.iterator();  //Specifying object is optional
		
		System.out.println(it.next()); // It will return only the first value from arrayList
		
		while(it.hasNext()) { // hasnext method will check if there is next element
			
			System.out.println("Using iterator Method value: "+it.next()); //next will get the element
		}
		
		//Checking arraylist empty or not
		
		System.out.println("\nIs arraylist empty: "+mylist.isEmpty());
		
		//To remove the multiple elements from arraylist
		
		ArrayList mylist2 = new ArrayList(); //Create another list where add items which needs to be removed
		mylist2.add('A');
		mylist2.add(100);
		
		mylist.removeAll(mylist2);  //from mylist remove mylist2 itemts
		
		System.out.println("\nAfter removing of element" +mylist);
		
		
		//To remove all the elements from arrayList
		mylist.clear();
		
		System.out.println("\nAfter removing all element" +mylist);
		
	}

}
