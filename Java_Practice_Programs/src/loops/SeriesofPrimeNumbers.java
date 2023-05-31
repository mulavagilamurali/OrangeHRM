package loops;

import java.util.Scanner;

public class SeriesofPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int lw = scan.nextInt();
		int up = scan.nextInt();
		int count = 0;
		for (int i=lw;i<=up;i++) {
			int num = i;
			int factors = 0;
			
			for (int j=1;j<=num;j++) {
				if (num%j==0) {
					factors++;
				}
			}
			if(factors ==2) {
				System.out.println(num);
				count++;
			}
		}
		if(count==0)
			System.out.println("In a given range no prime number");
		else
			System.out.println("In a given range prime numbers count " +count);
	}

}
