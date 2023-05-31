package javaBasicPrograms;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// Rectangle A = LW
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter L Value:");
		int L = scan.nextInt();
		System.out.println("Enter W Value:");
		int W = scan.nextInt();
		int A = L*W;
		System.out.println("Area of Rectangle: " +A);
		

	}

}
