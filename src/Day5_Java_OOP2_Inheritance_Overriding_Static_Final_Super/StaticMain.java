package Day5_Java_OOP2_Inheritance_Overriding_Static_Final_Super;

public class StaticMain {

	public static void main(String[] args) {
 // 	1) static methods can access static stuff directly (without object).
		System.out.println(StaticDemo.a);//10
		
		StaticDemo.m1(); // this is m1 static method.....
			
 //     System.out.println(b); // cannot access, b is non static
 //		m2();// cannot access , m2() is non-static
		
		
		//2) static methods can access non-static stuff through object
 // 	StaticDemo sd=new StaticDemo();
 //		System.out.println(sd.b);
 //		sd.m2();
 //	    sd.m();
	}

	}


