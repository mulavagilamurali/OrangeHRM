package com.Polymorphism;

public class MethodOverriding {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public static class MethodOverring1 extends MethodOverriding {
		public void add(int a, int b) {
			System.out.println(a+b);
		}
		public static void main(String[] args) {
			MethodOverriding add = new MethodOverriding();
			add.add(1,1);
			MethodOverring1 add1= new MethodOverring1();
			add1.add(2,1);	
		}
	
	}
	
}
