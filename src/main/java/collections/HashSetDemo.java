package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		//Declaration
		
		HashSet myset = new HashSet(); //To store heterogeneous data
		//Set myset = new HashSet(); //Valid for child class object with Parent Interface
		//HashSet <String> myset = new <String> HashSet() ; //To store homogeneous data
		
		//Adding elements to HashSet
		
		myset.add("Subba");
		myset.add("Subba");
		myset.add(100);
		myset.add(100);
		myset.add(true);
		myset.add(null);
		myset.add(false);
		myset.add(null);
		myset.add(100.6);
		myset.add(100.1);
		
		//Print HashSet Data
		
		System.out.println(" HashSet orginal Elements : "+myset); //Observe data is not in same order as entered and duplicate values eliminated
		
		//To remove specific value from set
		myset.remove(100.1); //Here direct value is passed since index is not supported
		System.out.println("\nHashSet after removing Elements : "+myset);
		
		//To insert the elements in between element - Insertion is not possible since order is not preserved
		 
		//Access specific value or retrieve value - Not possible since not supports indexing concept
		
		//Using workaround retrieving/accessing value -- By converting set to arraylist
		
		//Convert hashset to arraylist
		
		ArrayList list = new ArrayList(myset);
		System.out.println("HashSet in ArrayList Format " +list);
		System.out.println(list.get(1));
		
		//Read all values using looping statement
		//Normal for loop is not possible because there is no index in set
		
		for(Object x : myset) {
			System.out.println(x);
		}
		
		//Reading set data using iterator interface which traverse through all elements
		
		Iterator it = myset.iterator();
		
		while(it.hasNext()) {
			System.out.println("Set value using iterator ....>>>>>"+it.next());
		}
		
		//Clearning all values in HashSet
		
		myset.clear();
		
		System.out.println("After clearning set ------>>>>>>>"+myset);
		
		//Is empty
		
		System.out.println("\n Is Set empty >>>>>>>>>>"+myset.isEmpty());
		
		//Size of Set
		System.out.println("\n Size of HashSet  >>>>>>>>>>"+myset.size());
		
		
	}

}
