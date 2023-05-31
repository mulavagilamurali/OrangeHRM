package conditionProgrms;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Value:");
		int a= scan.nextInt();
		System.out.println("Enter B Value:");
		int b= scan.nextInt();
		System.out.println("Enter Operator");
		char operator = scan.next().charAt(0);
		switch (operator) {
		default: System.out.println("Invalid oprator");
		break;
		case '+' : System.out.println("Sum of a+b: "+(a+b));
		break;
		case '-': System.out.println("Sub of a-b: "+(a-b));
		break;
		case'*': System.out.println("Mul of a*b: " + (a*b));
		break;
		}
		
	}

}
