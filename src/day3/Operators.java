package day3;

public class Operators {

	public static void main(String[] args) 
	{
		// Arithmetic operators + - * / %
		int a=10, b=20;
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Subtraction of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Modulo division of a and b is:"+(a%b));
		
		
		
		// Relational/Comparison Operators > >= < <= != ==
		// returns boolean value
		
		System.out.println(a<b); // true
		System.out.println(a<=b); //true
		System.out.println(a>b);//false
		System.out.println(a>=b);//false
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		
		// Logical operators && || !
		// returns boolean value - true /false
		// works with 2 boolean values
		
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		boolean b1=10>20;
		System.out.println(b1);
		
		
		boolean b3=10<20;
		System.out.println(b3);
		boolean b2=10<20;
		System.out.println(b2);
			
		
		//increment and decrement operators
		
		
		
	}

}
