package day04_Methods_Constructors_OOP_Polymorphism_Encapsulation;

public class Greetings {
	
	//1) no params      no return value
	
	void m1()
	{
		System.out.println("Hello");
	}
	
	//2) no params      return value
	
	String m2()
	{
		return("hello how are you?");
	}
	
	//3) take params no return value
	 void m3(String name)
	 {
		 System.out.println("Hello "+name);
	 }
	 
	 //4) takes params     return values
	 String m4(String name) {
		 return("Hello "+name);
	 }
	
	

}


