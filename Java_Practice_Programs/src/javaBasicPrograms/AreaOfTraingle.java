package javaBasicPrograms;

import java.util.Scanner;

public class AreaOfTraingle {

	public static void main(String[] args) {
		// Area of Rectangle A = 1/2bh
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value b=");
		int b = scan.nextInt();
		System.out.println("Enter value h=");
		int h = scan.nextInt();
		int A = b*h;
		int B = A/2;
		
		System.out.println("Area of Triangle = " +B);
	}

}
