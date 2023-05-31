package loops;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int upper=0, lower=0, digits =0, special=0;
		
		char ch;
		do {
			System.out.print("Enter a character");
			ch = scan.next().charAt(0);
			
			if(ch>='A' && ch<='Z')
				upper++;
			else if(ch>='a' && ch<='z')
				lower++;
			else if(ch>='0' && ch<='9')
				digits++;
			else
				special++;
				
			
		} while(ch != '*');
		
		System.out.println("Uppercase Alphabets: " +upper);
		System.out.println("Lowercase Alphabets: " +lower);
		System.out.println("Numbers: " +digits);
		System.out.println("Special Characters: " +special);
		

	}

}
