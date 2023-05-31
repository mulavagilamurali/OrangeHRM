package javaBasicPrograms;

import java.util.Scanner;

public class studentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the student details: ");
		Scanner scan = new Scanner(System.in);
		// Student name
		System.out.print("Enter StudentID: ");
		int Studentid = scan.nextInt();
		System.out.print("Enter StudentName: ");
		String Sname = scan.next();
		System.out.print("Enter Marks% ");
		float markspercentage = scan.nextFloat();
		System.out.println("Student date of birth: ");
		double dob = scan.nextDouble();

	}

}
