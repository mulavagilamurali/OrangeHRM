package conditionProgrms;

import java.util.Scanner;

public class checksquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value l: ");
		int l = scan.nextInt();
		System.out.println("Enter the value b: ");
		int b = scan.nextInt();
		if (l==b) {
			System.out.println("It is square");
		}
		else
			System.out.println("It's not square");
	}

}
