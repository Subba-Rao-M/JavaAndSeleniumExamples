package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/***
 * hashmap is not synchronized and thread safe
 * hashmap allows null keys and null values
 * works with iterator
 * 
 * hashtable is synronized and thread safe
 * IT will not allow to use it until one program completes its execution using this data
 * hashtable will not allow null keys and values
 * Iterator will not work, enumerator should be used
 * 
 */

public class HashTable_Demo_1 {

	public static void main(String[] args) { // TODO Auto-generated method stub

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));

	

	}
}
