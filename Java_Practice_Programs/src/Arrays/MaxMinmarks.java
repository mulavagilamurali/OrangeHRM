package Arrays;

import java.util.Scanner;

public class MaxMinmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = scan.nextInt();
		// create  Arrayobject using the datatype
		int marks[] = new int[size];
		System.out.println("Enter the marks:");
		for (int i=0;i<marks.length;i++) {
			marks[i]=scan.nextInt();
		}
		System.out.println("Enter Array values");
	}

}
