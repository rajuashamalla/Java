package day1;

public class Operators {

	public static void main(String[] args) {

		 // 1) Arithmetic Operators: Used for mathematical calculations.     + - * % /
	
		int a=30, b=10;
		System.out.println("Addition of  a and b:"+(a+b));
		System.out.println("Sub  of  a and b:"+(a-b));
		System.out.println("Mul  of  a and b:"+(a*b));
		System.out.println("Div  of  a and b:"+(a/b));
		System.out.println("Modulo div  of  a and b:"+(a%b));

		
		// 2) Relational (Comparison) Operator =Used to compare two values and return a boolean result.
		
		System.out.println(a<b);  //false
		System.out.println(a<=b); //false
		System.out.println(a>b); // true
		System.out.println(a>=b); //true
		System.out.println(a==b); //false
		System.out.println(a!=b); //true

		//Logical Operators:Used to combine or modify boolean expressions. returns boolean values  &&   ||  !
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);  //false
		System.out.println(x || y);  //true
		System.out.println(!x);  //false
		System.out.println(!y);  //true
		
		
		
		
	}

}
