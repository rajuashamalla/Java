package day04_Methods_Constructors_OOP_Polymorphism_Encapsulation;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greetings gr=new Greetings();
		gr.m1();
		String s=gr.m2(); //Hello
		System.out.println(s); //hello how are you?
		gr.m3("Tony"); //Hello Tony
		String var=gr.m4("hulk");
		System.out.println(var); //Hello hulk

	}

}
