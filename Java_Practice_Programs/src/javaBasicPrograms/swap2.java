package javaBasicPrograms;

public class swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 35;
		int b = 20;
		System.out.println("ab values before swap:" + a +","+ b);
		// add both values
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("ab values after swap:" + a +","+ b);
	}

}
