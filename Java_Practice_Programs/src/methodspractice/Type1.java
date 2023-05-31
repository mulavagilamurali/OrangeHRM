package methodspractice;

import java.util.Scanner;

public class Type1 {

	public static void main(String[] args) {
		// -- without return type without parameter
		Type1.product();
		
	}
	public static void product()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a b values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a*b);
		
	}
}
