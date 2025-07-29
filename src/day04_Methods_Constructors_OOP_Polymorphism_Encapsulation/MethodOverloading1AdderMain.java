package day04_Methods_Constructors_OOP_Polymorphism_Encapsulation;

public class MethodOverloading1AdderMain {

	public static void main(String[] args) {
		MethodOverloading1Adder addobj = new MethodOverloading1Adder();

		addobj.sum();                  // 10 + 20
		addobj.sum(100, 200);          // int, int
		addobj.sum(50, 10.5);          // int, double
		addobj.sum(10.5, 50);          // double, int
		addobj.sum(10, 20, 30);        // 3 int arguments
	}
}
