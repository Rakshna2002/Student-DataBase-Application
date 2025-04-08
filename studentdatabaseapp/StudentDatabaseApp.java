package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Enter the number of new students to enroll: ");
		Scanner sc=new Scanner(System.in);
		int numOfStu=sc.nextInt();
		Student[] students=new Student[numOfStu];
		
		for(int i=0;i<numOfStu;i++) {
			students[i]=new Student();
			students[i].enroll();
			students[i].payTut();
			System.out.println(students[i].showInfo());
		}
	}

}
