import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value n:");
		int n = scan.nextInt();
		if(n<0) {
			System.out.println(-1*n);
		}
		else
			System.out.println(n);

	}

}
