package conditionProgrms;

import java.util.Scanner;

public class shopDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user quantity");
		int quantity = scan.nextInt();
		int unitcost = 100;
		int purchasedquantity = unitcost*quantity;
		if (purchasedquantity >= 1000) {
			int discoprice = (purchasedquantity/100)*10;
			int totalcost = purchasedquantity - discoprice;
			System.out.println("After 10% discount Total Purchase Price is: " +totalcost);
		}
		else
			System.out.println("Discount is not applicable: "+purchasedquantity);
	}

}
