package oopsConcepts.inheritance;

public class ThisDemo {
	
	int a = 3;
	
	public void getData() {
		int a = 2;
		System.out.println(a); //2
		System.out.println(this.a);//3
		int c = a + this.a;
		System.out.println(c);
	}

	public static void main(String[] args) {
		ThisDemo d = new ThisDemo();
		d.getData();

	}

}
