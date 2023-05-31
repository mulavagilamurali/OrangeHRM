package methodspractice;

import java.util.Scanner;

public class Type4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a b values");
		int a= scan.nextInt();
		int b= scan.nextInt();
		Type4 obj = new Type4();
		int result = obj.product(a, b);
		System.out.println(result);
		}
	public int product(int a, int b)
	{
		int c=a*b;
		return c;
	}
}
