package conditionProgrms;

import java.util.Scanner;

public class StudentAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter number of classes Attended: ");
		float nca = scan.nextInt();
		System.out.print("Enter number of classes Held: ");
		float nch = scan.nextInt();
		float SP = (nca / nch)*100; 
		System.out.println("Student attedance percentage: " +SP);
		if (SP >= 75) {
			System.out.println("Student will allow to sit in exam");
		}
		else
			System.out.println("Student will not allow to exam");
	}
	

}
