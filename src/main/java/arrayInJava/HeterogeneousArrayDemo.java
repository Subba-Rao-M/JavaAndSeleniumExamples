package arrayInJava;

public class HeterogeneousArrayDemo {

	public static void main(String[] args) {
		/***********
		 * Can we store Heterogeneous data in array : yes
		 * Not recommended
		 * Object is also like String root class and
		 * Object x = can hold any type of data
		 * Object comes under non primitive data type
		 */
		
		Object a[] = {1, 1.5, "String", true };
		
		System.out.println(a.length);
		System.out.println(a[3]);
		
		for(Object o : a) {
			System.out.println(o);
		}

	}

}
