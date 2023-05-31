package conditionProgrms;

import java.util.Scanner;

public class absolutevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input1: ");
		int input1 = scan.nextInt();
		System.out.println("Enter input1: ");
		int input2 = scan.nextInt();
		if (input1 == input2)
		{
			System.out.println("Output1: " +input1);
			System.out.println("Output2: " +input2);
		}
		else
			System.out.println("Mismatch");
	}

}
