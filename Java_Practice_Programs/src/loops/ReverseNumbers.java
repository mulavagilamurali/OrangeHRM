package loops;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		int temp = num;
		int rev=0;
		
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
	
		}
		System.out.println(rev);
		if(rev == temp)
			System.out.println("Paligromn");
		else
			System.out.println("Not Paligromn");
	}

}
