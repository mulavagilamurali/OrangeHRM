package conditionProgrms;

import java.util.Scanner;

public class CheckInputCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value ");
		char ch = scan.next().charAt(2);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is a Upper case");
		}
		else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a Lower Case");
		}
		else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is Number");
		}
		else 
			System.out.println(ch + " is Special character");
		
	}

}
