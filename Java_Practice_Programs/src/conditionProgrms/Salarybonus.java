package conditionProgrms;

import java.util.Scanner;

public class Salarybonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the salary");
		int salary = scan.nextInt();
		System.out.println("enetr the service years");
		int serviceyears = scan.nextInt();
		if(serviceyears > 5) {
			int bonus = (salary/100)*5;
			System.out.println("Salary with bonus: " + (salary+bonus));
		}
		else
			System.out.println("Salary without bonus: " + salary);

	}

}
