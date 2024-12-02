package controlStatemens;

public class NestedIfElseDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		if(1!=1) {
			if(true) {
				System.out.println("abc");
			}
			else {
				System.out.println("xyz");
			}
		}
		else {
			System.out.println("123");
		}

	}

}
