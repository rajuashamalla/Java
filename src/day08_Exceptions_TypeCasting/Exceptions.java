package day08_Exceptions_TypeCasting;

import java.util.Scanner;

public class Exceptions {
	
	
	public static void main(String[] args) {
		System.out.println("program is started ....");
		Scanner sc=new Scanner(System.in);
		
		//ex-1
	/*	System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(100/num); // ArithematicException
	*/	
		
		//Ex-2
	/*	int a[]=new int[5];
		System.out.println("Enter the postion(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value; //ArrayIndexOutOfBoundsException
		
		System.out.println(a[pos]);
		
	*/	
	/*	//ex-3
		String s="hello";
		int num=Integer.parseInt(s); //NumberFormatException
		System.out.println(num);
	*/
	//	exp-4
		String s=null;
		System.out.println(s.length()); //NullPointerException
		
		
		
		
		System.out.println("program is completed...");
		System.out.println("program exited....");
		
		
	}

}
