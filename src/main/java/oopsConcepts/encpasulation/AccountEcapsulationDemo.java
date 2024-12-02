package oopsConcepts.encpasulation;

public class AccountEcapsulationDemo {
	
	private int accNo; //if private it cannot be called in other classes using object
	private String accName;
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private double amount;
	
	void setAccNo(int accNo) { 
		/**
		 * accNo in above method definition is local variable
		 * If it is assigned to class variable it will display default value as java gets confused with class and local variable
		 * To overcome this, this keyword is used with class variable
		 * this keyword refers to class variable with both local and class variables are same
		 */
		this.accNo = accNo;
		
	}
	
	int getAccNo() {
		return accNo;
	}

}
