package Day5_Java_OOP2_Inheritance_Overriding_Static_Final_Super;



class A
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c=300;
	void print()
	{
		System.out.println(c);
	}
}

public class InheritanceTypes {
	
	public static void main(String[] args)
	{
//		B bobj=new B();
//		System.out.println(bobj.a);
//		System.out.println(bobj.b);
//		
//		bobj.display();
//		bobj.show();	
		C cobj=new C();
		
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.display();
		cobj.show();
		cobj.print();
		
		
		
		
	}
}
