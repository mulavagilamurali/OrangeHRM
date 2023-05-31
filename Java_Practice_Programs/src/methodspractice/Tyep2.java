package methodspractice;

public class Tyep2 {

	public static void main(String[] args) {
		// +- with return type without parameter
		Tyep2 obj = new Tyep2();
		int result = obj.product();
		System.out.println(result);

	}
	public int product()
	{
		int a = 10;
		int b = 21;
		int c = a*b;
		return c;
	}
}
