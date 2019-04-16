package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	// initiate all of the data for each student
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses= "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	/*constructor create the student constructor based on number of students requested
	  ask for name and year in constructor */
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - freshman\n2 - sophmore\n3 - junior\n4 - senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		
		
	}
	
	//set 5 digit ID with first number being grade level
	private void setStudentID() {
		//grade plus id
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	//add courses
	
	public void enroll() {
		//get in a loop, user hits Q
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;	
				}
		}while (1 != 0);
		
		
		//System.out.println("ENROLLED IN: " + courses);
		//System.out.println("TUITION BALANCE: $"+ tuitionBalance);
	}
	
	//get/view balance
	public void viewBalance() {
		System.out.println("Your balance is: $"+ tuitionBalance);
	}
	
	//update/pay balance
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance= tuitionBalance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	//show student status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
	
}
