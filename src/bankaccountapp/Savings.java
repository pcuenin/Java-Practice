package bankaccountapp;

public class Savings extends Account {
	// list properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//constructor to initialize settings for the savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = 1 + accountNumber;
		setSafetyDepositBox();
		
		/* System.out.println("ACCOUNT NUM:" + this.accountNumber);
		System.out.println("NEW SAVINGS ACCOUNT");
		System.out.println(name);*/
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
		
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	
	//list any methods specific to savings account
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Savings Account Features" 
				+"\n Safety Deposit Box ID: " + safetyDepositBoxID
				+"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
		
	}

	

}
