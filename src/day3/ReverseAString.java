package day3;

public class ReverseAString {

	public static void main(String[] args) {
	/*	// Approach-1  = length , charAt
		String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>0;i--)
		{
			rev=rev+s.charAt(i);
		}
			System.out.println("Reverse string is:"+ rev);
	*/		
	/*	//Approach2  - without using string methods
		String s="welcome";
		String rev="";	
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>0;i--)
		{
			rev=rev+a[i];
		}
			System.out.println("reverse string is:"+ rev);//reverse string is:emocle
	*/		
	/*	// Approach 3 using StringBuffer Class
			StringBuffer s= new StringBuffer("welcome");
			System.out.println("Reverse string is: "+s.reverse()); //Reverse string is: emoclew
		*/
		//	Approach 3 using StringBuffer Class
			StringBuilder s= new StringBuilder("welcome");
			System.out.println("Reverse string is: "+s.reverse()); //Reverse string is: emoclew
			
			
	}

}
