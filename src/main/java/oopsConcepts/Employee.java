package oopsConcepts;

public class Employee {
	
	//Class Variables
	int eid;
	String ename;
	String job;
	int sal;
	
	
	//Methods
	
	void display() { // This cannot be inside main method // Method cannot have sub methods i.e  method inside method
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	
	
	

	/*
	 * public static void main(String[] args) {
	 * 
	 * Employee emp1 = new Employee(); emp1.eid=1; emp1.ename="Subba"; emp1.job
	 * ="Test"; emp1.sal = 1000; emp1.display(); System.out.println(emp1.eid); // To
	 * display without using display method
	 * 
	 * 
	 * Employee emp2 = new Employee(); emp2.eid=2; emp2.ename="John"; emp2.job
	 * ="Manager"; emp2.sal = 2000; emp2.display(); }
	 */

}
