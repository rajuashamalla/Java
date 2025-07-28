package day04_Methods_Constructors_OOP_Polymorphism_Encapsulation;

public class MethodOverloading1Adder {
	
	int a = 10, b = 20;

	public void sum() {
		System.out.println(a + b);
	}

	public void sum(int x, int y) {
		System.out.println(x + y);
	}

	public void sum(int x, double y) {
		System.out.println(x + y);
	}

	public void sum(double y, int x) {
		System.out.println(x + y);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
