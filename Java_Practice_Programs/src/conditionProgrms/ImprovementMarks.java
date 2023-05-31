package conditionProgrms;

import java.util.Scanner;

public class ImprovementMarks {

	public static void main(String[] args) {
      
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int mainmarks = 80;
		System.out.println("Did you write improvement exam?");
		String improvement = scan.next();
		if(improvement.equals("yes")) {
			System.out.println("Please enter improvement marks");
			int impmarks = scan.nextInt();
			if (impmarks>mainmarks) {
				System.out.println("Final Marks: " +impmarks);
			}
			else
				System.out.println("Final Marks: " +mainmarks);
		}
		else
			System.out.println(mainmarks);

	}
}
