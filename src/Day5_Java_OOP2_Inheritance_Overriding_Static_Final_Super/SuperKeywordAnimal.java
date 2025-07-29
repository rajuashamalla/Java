package Day5_Java_OOP2_Inheritance_Overriding_Static_Final_Super;

public class SuperKeywordAnimal {
	String color="white";
	
	void eat()
	{
		System.out.println("eating...........");
	}
	
	
	
}

class Dog extends SuperKeywordAnimal
{
	String color="Black";
	void displayColor()
	{
		System.out.println(super.color);
	}
	
	void eat()
	{
		//System.out.println("eating bread........");
		super.eat();
	}
}
