package conditionProgrms;

import java.util.Scanner;

public class StudentMedicalCause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of class attendance: ");
		float nca = scan.nextFloat();
		System.out.println("Enter number of classes held");
		float nch = scan.nextFloat();
		float attendancePer = (nca/nch)*100;
		if(attendancePer<75) {
			
		}
		

	}

}
