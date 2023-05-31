package com.Polymorphism;

public class MethodOverloading {
	
	// two or more methods in same class or sub class with same name and  different signatures
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(String a, String b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloading addOperation = new MethodOverloading();
		addOperation.add(10, 20);
		addOperation.add("Testing", "Selenium");	
	}

}
