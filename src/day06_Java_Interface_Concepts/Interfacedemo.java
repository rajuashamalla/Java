package day06_Java_Interface_Concepts;
interface Shape
{
	int length=10;// final and static
	int width=20;// final static
	
	
	void circle();//abstract method
	
	default void square()
	{
		System.out.println("this is square  -  default method ");
	}
	
	static void rectangle()
	{
		System.out.println("this is rectangle - static method");
	}
	
}

public class Interfacedemo implements Shape
{
	public void circle()
	{
		System.out.println("this is circle - abstract method");
	}
	
	public static void main(String[] args) {
//		// Scenario-1
//		Interfacedemo idobj= new Interfacedemo();
//		idobj.circle();  //abstract
//		idobj.square(); //default
//		Shape.rectangle();  // static method can directly access from interface

		//Scenario 2
		Shape sh=new Interfacedemo();
		sh.circle(); // abstract
		sh.square(); // default
		Shape.rectangle();//static method can directly access from interface 
//		sh.triangle();  // we cannot access
		System.out.println(Shape.length * Shape.width); // accessing static variables directly
	}

}
