package Day5_Java_OOP2_Inheritance_Overriding_Static_Final_Super;

class ABC 
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
	
}


class XYZ extends ABC
{
	void m1(int a)   // overriding
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b)  //overloading
	{
		System.out.println(a+b);
	}
}

public class OverLoadingVsOverriding {

	public static void main(String[] args) {
		XYZ xyzobj=new XYZ();
		xyzobj.m1(10);
		xyzobj.m2(20);
		xyzobj.m2(10,20);
	}

}
