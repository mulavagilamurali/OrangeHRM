package conditionProgrms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n vlaue: ");
		int n = scan.nextInt();
		int Rem = n%2;
		if (Rem == 0) {
			System.out.println(n + " is even number");
		}
		else {
			System.out.println( n +" is odd number");
		}
			
			
	}

}
