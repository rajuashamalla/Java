package day2;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	/*	//example 1
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		
		System.out.println("Addition of 2 numbers:" +(num1+num2));
	*/
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Your name is :"+name);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Your age is:" +age);
		
		System.out.println("enter unknown value");
		Object value=sc.next();
		System.out.println(value);
		
		
	}

}
