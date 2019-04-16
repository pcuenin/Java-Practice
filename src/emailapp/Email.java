package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10; // set password lenth here
	private String alternateEmail;
	private String companySuffix = "cuenin.tech";
	
	
	//constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// call a method asking for the dept and return the dept
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//call method to return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is " + email);
	}
	
	//ask for dept
	private String setDepartment() {
		System.out.println("New worker:" + firstName +". DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3) {return "acct";}
		else {return "";}
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789!@$%";
		char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String (password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alt email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	//change the password
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}
	
	//get methods
	public int getMailboxCapacity() { return mailboxCapacity;}
	public String getAlternateEmail() { return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: "+ firstName +" " + lastName +
				"\nCOMPANY EMAIL:  " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity +"mb";
	}
	
}