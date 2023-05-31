package conditionProgrms;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value as a: ");
		int a = scan.nextInt();
		System.out.print("Enter value as b: ");
		int b = scan.nextInt();
		System.out.print("Enter value as c: ");
		int c = scan.nextInt();
		if (a>b && a>c) {
			System.out.println("A is greater");
		}
		else if (b>c) {
			System.out.println("B is greater");
		}
		else
			System.out.println("C is greater");
	}

}
