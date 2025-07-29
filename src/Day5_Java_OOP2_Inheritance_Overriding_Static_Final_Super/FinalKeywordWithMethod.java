package Day5_Java_OOP2_Inheritance_Overriding_Static_Final_Super;



class Test1    // final class Test1
{
	final void m()
	{
		System.out.println("this is m method from Test1..");
	}
}

class Test2 extends Test1  //incorrect , because Test1 is final class
{
	//void m()  // incorrect , because m() is final method
	{
		System.out.println("this is m method from Test2");
	}
}
public class FinalKeywordWithMethod {

}
