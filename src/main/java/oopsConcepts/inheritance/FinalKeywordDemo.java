package oopsConcepts.inheritance;

class Test{
	int x=100;
	final int y = 200; //Cannot change this value again
}

public class FinalKeywordDemo {

	public static void main(String[] args) {
		Test t = new Test();
		t.x=300;
		//t.y = 300; // Cannot change because of final keyword
		 System.out.println(t.x);
		 System.out.println(t.y);

	}

}
