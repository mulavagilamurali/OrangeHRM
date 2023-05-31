package conditionProgrms;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// Game level - 3000, 6000, 12000
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Score: ");
		int score = scan.nextInt();
		if (score >= 3000) {
			System.out.println("Congratulation you have unlocked level-2 \n Entered into Level2...");
			score = scan.nextInt();
		if (score >= 6000) {
			System.out.println("Congratulation you have unlocked level-3 \n Entered into level3....");
			score = scan.nextInt();
			if (score >= 12000) {
				System.out.println("Congratulation your winner....");
			}
			else 
				System.out.println("Congratulations your Runner.....");
			
		}
		else
			System.out.println("Nice, try next time");
		}
		else
			System.out.println("Better luck next time....");
		
		

	}

}
