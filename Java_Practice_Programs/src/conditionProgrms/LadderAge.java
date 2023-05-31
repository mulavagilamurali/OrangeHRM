package conditionProgrms;

import java.util.Scanner;

public class LadderAge {

	public static void main(String[] args) {
		// age 18 - 25, 26-45, 45 - 60
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter age: " );
		int age = scan.nextInt();
		if (age >= 18 && age <=25) {
			System.out.println("Employee age between 18 to 25: " + age);
		}
		else if (age <= 26 && age >= 45) {
			System.out.println("Employee age between 26 to 45: "+ age);
		}
		else if (age >=46 && age<=60) {
			System.out.println("Employee age between 46 to 60: " + age);
		}
		else
			System.out.println("Employee age greaterthan 60: " +age);
		
	}

}
