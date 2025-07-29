package Day5_Java_OOP2_Inheritance_Overriding_Static_Final_Super;

public class StaticDemo {
	
	static int a=10; //static variable
	int b=20;   //non static variable
	
	static void m1() //static method
	{
		System.out.println("this is m1 static method..... ");
	}
	
	void m2() // non-static method
	{
		System.out.println("this is m2 non-static method..... ");
	}
	
	
	void m() //non-static method can access evreything directly
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	
	
//	public static void main(String[] args) {
//		
//		//1) static methods can access static stuff directly (without object).
//		System.out.println(a);//10
//		
//		m1(); // this is m1 static method.....
//			
//		//System.out.println(b); // cannot access, b is non static
////		m2();// cannot access , m2() is non-static
//		
//		
//		//2) static methods can access non-static stuff through object
//		StaticDemo sd=new StaticDemo();
////		System.out.println(sd.b);
////		sd.m2();
//		sd.m();
//	}

}
