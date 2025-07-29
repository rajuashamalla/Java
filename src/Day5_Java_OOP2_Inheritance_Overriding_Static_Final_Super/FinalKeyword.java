package Day5_Java_OOP2_Inheritance_Overriding_Static_Final_Super;

class Test
{
	final int x=100;
	
}

public class FinalKeyword {
	public static void main(String[] args) {
		Test t=new Test();
	//	t.x=200; //incorrect , because x is final variable
		System.out.println(t.x); 
	}
}
