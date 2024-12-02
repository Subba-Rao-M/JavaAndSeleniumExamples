package oopsConcepts.inheritance;

class Bank{
	
	double rateOfInterest(){
		return 0;
		
	}
	
}
class SBI extends Bank {
double rateOfInterest(){
	return 5.5;
	
}
}


class Axis extends Bank {
double rateOfInterest(){
	return 6.5;
	
}

}

class Canara extends Bank {
double rateOfInterest(){
	return 9.5;
	
}

}

public class MethodOverridingDemo {

	public static void main(String[] args) {
	SBI sbi = new SBI();
		
		System.out.println(" Rate of interest for SBI : "+sbi.rateOfInterest());
		
		Axis ax = new Axis();
		System.out.println("Rate of interest for Axis :"+ax.rateOfInterest());
		
		Canara ca = new Canara();
		System.out.println("Rate of interest for Canara :"+ca.rateOfInterest());

	}

	

}
