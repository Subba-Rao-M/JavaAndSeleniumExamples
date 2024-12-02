package oopsConcepts.encpasulation;

public class AccountEcapsulationMain {

	public static void main(String[] args) {
		AccountEcapsulationDemo acc = new AccountEcapsulationDemo();
		/*
		
		acc.accNo = 1001;
		acc.accName = "S";
		acc.amount = 1000.00;
		
		// above is not enacapusaltion if you are able to call it
		 *
		 */
		
		acc.setAccNo(100);
		acc.setAccName("John");
		acc.setAmount(1000);
		System.out.println(acc.getAccNo());
		System.out.println(acc.getAccName());
	}

}
