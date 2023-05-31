package loops;

public class Fibonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1; 
		int c;
		do {
			c=a+b;
			if (c>10)
				break;
			System.out.println(c);
			a=b;
			b=c;
		}while(true);
		
	}

}
