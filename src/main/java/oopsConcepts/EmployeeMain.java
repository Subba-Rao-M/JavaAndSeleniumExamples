package oopsConcepts;

public class EmployeeMain {

public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eid=1;
		emp1.ename="Subba";
		emp1.job ="Test";
		emp1.sal = 1000;
		emp1.display();
		System.out.println(emp1.eid); // To display without using display method

		
		Employee emp2 = new Employee();
		emp2.eid=2;
		emp2.ename="John";
		emp2.job ="Manager";
		emp2.sal = 2000;
		emp2.display();
	}

}
