package Arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a size: ");
		int size = scan.nextInt();
		//System.out.println("Enter a marks: ");
		//int marks = scan.nextInt();
		int marks[] = new int[size];
		System.out.println("Enter the array values: ");
		for(int i=0; i<marks.length;i++) {
			marks[i]=scan.nextInt();
		}
		System.out.println("Enter array values: ");
		for (int h:marks) {
			System.out.println(h);
		}
		

	}

}
