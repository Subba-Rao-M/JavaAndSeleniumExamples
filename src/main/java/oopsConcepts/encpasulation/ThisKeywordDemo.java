package oopsConcepts.encpasulation;

//int x, y; //Global variables not applicable in java

public class ThisKeywordDemo {
	
	int x, y; //Class variables or instance variables
	
	/*ThisKeywordDemo(int a, int b){ // a and b are local variables
		x=a;
		y=b;
	}
	
	ThisKeywordDemo(int x, int y){ // x and y are local variables and will result in logical error by assigning default value 0
		x=x;
		y=y;
	}
	
	
	
	ThisKeywordDemo(int x, int y){ 
		this.x=x; // this is class here
		this.y=y;
	}
	
	
	
	void setData(int a, int b) {
		x=a;
		y=b;
	}
	*/
	
	void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int a, b; // Local variables
		
		/*ThisKeywordDemo th = new ThisKeywordDemo(199, 299);
		th.display();
		*/
		ThisKeywordDemo th1 = new ThisKeywordDemo();
		th1.setData(100, 200);
		th1.display();

	}

}
