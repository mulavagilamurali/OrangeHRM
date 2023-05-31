package loops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
	 // n=4; 1, 2, 3, 4;  factor count, display count and factor
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value n");
		int n = scan.nextInt();
		int factors = 0;
		for (int i=1;i<=n;i++) {
			int rem = n%i;
			if (rem==0) {
				System.out.println(i);
				factors++;
			}			
		}
		System.out.println("Display factor count:" +factors);
		if (factors == 2) {
			System.out.println("It is prime number");
		}
		else
			System.out.println("Not a prime number");
	}

}
