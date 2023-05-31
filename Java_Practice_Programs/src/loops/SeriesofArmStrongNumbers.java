package loops;

import java.util.Scanner;

public class SeriesofArmStrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the N value: ");
		int lw=scan.nextInt();//100
		int up=scan.nextInt();//1000
		int factor =0;
		int count = 0;
		for (int i=lw;i<=up;i++) {
			int num = i;
			int temp=num;
			int sum = 0;
			while(num>0) {
				int rem = num%10;
				sum = sum+rem*rem*rem;
				num=num/10;
			}
			//System.out.println("Sum of cube of "+temp+" is "+sum);
			if(temp==sum) {
				System.out.println("It is armstrong" +sum);
				count++;
			}
				
		}
		if(count==0)
			System.out.println("In a given range no arm strong");
		else
			System.out.println("No.of armstrong is "+count);
	}

}
