package Day5_Java_OOP2_Inheritance_Overriding_Static_Final_Super;

public class ThisKeyword {
		int x,y;   // class variables/instance variables
		
	/*	ThisKeyword(int a, int b)
		{
			this.x=x;
			this.y=y;
		}
	*/
		
		
		void setData(int a, int b)
		{
			x=a;
			y=b;
		}
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}	
		
	public static void main(String[] args) {

	//	ThisKeyword th=new ThisKeyword(100,200);
		ThisKeyword th=new ThisKeyword();
		th.setData(100,200);
		th.display();   //100   200
	}

}
