package studentdatabaseapp;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private String fname;
	private String lname;
	private int gradeYear;
	private String studentId;
	private List<String> courses = new ArrayList<>(); //used arraylist instead of string
	private int tutBal=0;
	private static int costPerCourse=600;
	private static int id=1000;
		

	//Constructors
	public Student(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.fname=sc.nextLine();
		System.out.print("Enter student's last name: ");
		this.lname=sc.nextLine();
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student's Grade year: ");
		this.gradeYear = sc.nextInt();
		setStudentId();
	}
		
	//Generate ID
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
		
	//Enroll in course
	public void enroll() {
		do {
		System.out.print("Enter course to enroll (Q to Quit): ");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		if(!course.equalsIgnoreCase("Q")) {
			courses.add(course);
			tutBal+=costPerCourse;
		}else {
			break;
		}
		}while(1!=0);
		System.out.println("Tuition Amount: $" + tutBal);
	}
		
	//View balance
	public void viewBal() {
		System.out.println("Your Pending Balance: $ " + tutBal);
	}
		
	//Pay tuition
	public void payTut() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your payment amount: $");
		int payment=sc.nextInt();
		tutBal=tutBal-payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBal();
	}
		
	//Show status
	public String showInfo(){
		return "\n\n--------Student Details--------" + 
				"\nStudent ID: "+studentId +
				"\nName: " + fname + " " + lname +
				"\nGrade Level: "+ gradeYear + 
				"\nCourses Enrolled: " + String.join(", ", courses) +
				"\nPending Balance: $" + tutBal + "\n\n";
	}

	
	
}
