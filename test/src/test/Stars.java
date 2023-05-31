package test;

public class Stars {
	public void m1(int a, int b) {
		System.out.println("Overload method");
	}
	public void m1() {
		System.out.println("Different signature");
	}
	public static void main(String Args[]) {
		Stars m = new Stars();
		//m.m1(int a, b);
		//m.m1();
		
	}

}
