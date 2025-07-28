package day04_Methods_Constructors_OOP_Polymorphism_Encapsulation;

public class Constructor {
	
	int x,y;
	Constructor()   //default constructor
	{
		x=100;
		y=200;
	}
	
	Constructor(int a,int b) // parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
	//	Constructor cd=new Constructor(); // invoked default constructor
		Constructor cd=new Constructor(10,20); //parameterized constructor
		cd.sum(); //300
			
	}

}
