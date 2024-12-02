package collections;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map.Entry;


public class HashMapDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		//Declare hashmap
		
		//HashMap hm = new HashMap();
		//Map mp = new HashMap();
		HashMap <Integer, String >hm = new HashMap<Integer, String>();
		
		//Adding data/pairs data to hashmap using put method
		
		hm.put(1, "John");
		hm.put(1, "Wright"); // replaced above value or update
		hm.put(2, "David");
		hm.put(3, "Brown");
		hm.put(4, "Test");
		
		System.out.println("Original Value >>>>>>>>>>>"+hm);
		
		//Size of hashmap
		
		System.out.println("Original Value >>>>>>>>>>>"+hm.size());
		
		//To remove pair using key
		hm.remove(3);
		System.out.println("After removing hashmap Value >>>>>>>>>>>"+hm);
		
		//To retrieve the value of key
		
		System.out.println(hm.get(1));
		
		
		//Get all keys from hashmap
		System.out.println("Print all keys>>>>>>>>>>" +hm.keySet());
		
		//Print all values
		
		System.out.println("Print all values>>>>>>>>>>" +hm.values());
		
		//Retrieve key and values
		System.out.println("Print all key and values>>>>>>>>>>" +hm.entrySet());
		
		//Reading data from HashMap using for eachloop
		
		for(int k: hm.keySet()) {
			System.out.println(k+ "   "+hm.get(k));
			
		}
		
		
		//Using Iterator 
		
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry entry= it.next();
			System.out.println("\n"+entry.getKey()+"    "+entry.getValue());
		}
		
		
		//To clear hash Map
		
		hm.clear();
		
		System.out.println("Is hashmap empty>>>>>>>>"+hm.isEmpty());
		
	}

}
