package bankaccountapp;

public class Checking extends Account {
	// list properties specific to a checking account
	private int debitCardNumber;
	private int pin;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = 2 + accountNumber;
		setDebitCard();
		
		/*System.out.println("ACCOUNT NUM:" + this.accountNumber);
		System.out.println("NEW CHECKING ACCOUNT");
		System.out.println("NAME: "+ name);*/
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
		
	}
	// List any methods specific to the checking account
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		pin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features"
				+ "\n Debit Card Number: " + debitCardNumber 
				+ "\n Debit Card Pin: " + pin
				);
	}

	

}
