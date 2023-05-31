package conditionProgrms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A value:");
		int a = scan.nextInt();
		System.out.println("Enter B value:");
		int b = scan.nextInt();
		System.out.println("Enter operator:");
		char operator = scan.next().charAt(0);
		if (operator == '+') {
			System.out.println("sum of a+b= " +(a+b));
		}
		else if (operator == '-') {
			System.out.println("Sum of a-b= " + (a-b));
		}
		else if (operator == '*') {
			System.out.println("Mul of a*b= " +(a*b));
		}
		else
			System.out.println("Invalid Operator");

	}

}
