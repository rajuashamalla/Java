package day3;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		//String s="Welcome";
		//String s=new String("Welcome");
	//	System.out.println(s);
		
		//length() - returns length of a string(number of characters)
		String s="Welcome";
		s.length();
		System.out.println(s.length()); //7
		System.out.println("Welcome".length());
		
		//concat() - joining strings
		String s1="Welcome";
		String s2="to Java";
		String s3="Automation testing";
		System.out.println(s1+s2);  //Welcometo Java
		System.out.println(s1.concat(s2)); //Welcometo Java
		System.out.println(s1+s2+s3); //Welcometo JavaAutomation testing
		System.out.println(s1.concat(s2).concat(s3)); //Welcometo JavaAutomation testing
		System.out.println("welcome"+"to Java");  //welcometo Java
		System.out.println("Welocme".concat("to java")); //welcometo Java
		
		//trim() - remove spaces right and left side
		s="     Welcome      ";
		System.out.println("Before trimming"+s.length()); //Before trimming18 // prints string along with spaces       Welcome     
		System.out.println("After trimming"+s.trim().length()); //Welcome // After trimming7
		
		//charAt() - returns a character from  String based on index
		//index starts from 0
		s="Welcome";
		System.out.println(s.charAt(3)); //c
		System.out.println(s.charAt(0)); //W
		
		//contains() - returns true or false
		//checks string is part of main string or not
		System.out.println(s.contains("Wel")); //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("wel")); //false
		
		//equals() , equalsIgnoreCase() - compare strings
		s1="hello";
		s2="hello";
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals("Hello")); //false
		System.out.println(s1.equalsIgnoreCase("Hello")); //true
		
		//replace() replace single or multiple(sequence) of characters in a string
		s="welcome to selenium java selenium python selenium C#";
		System.out.println(s.replace('e','X'));//wXlcomX to sXlXnium java sXlXnium python sXlXnium C#
		System.out.println(s.replace("selenium", "github"));//welcome to github java github python github C#

		//substring() - extract substring from main string
		//starting index - 0
		// ending index -1
		s="selenium";
		System.out.println(s.substring(1,5)); //elen
		System.out.println(s.substring(0,3)); //sel
		
		//toUpperCase() toLowerCase()
		s="Hello world";
		System.out.println(s.toUpperCase()); //HELLO WORLD
		System.out.println(s.toLowerCase()); //hello world
		
		// split() - split the string into multiple parts based on delimiter
		s="google@gmail.com";
		String a[]=s.split("@");
		System.out.println(Arrays.toString(a));// [google, gmail.com]
		System.out.println(a[0]); //  google
		System.out.println(a[1]); //  gmail.com
		
		//example1
		String amount = "$15,20,25"; //expected op 152025
		System.out.println(amount.replace("$", "")); //    15,20,25
		System.out.println(amount.replace("$", "").replace(",", "")); // 152025
		
		//example 2
		s="Google,gmail@gmail.com";
		String arr1[]=s.split(",");  
		System.out.println(Arrays.toString(arr1));// [Google, gmail@gmail.com]
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); //[gmail, gmail.com]
		System.out.println(arr1[0]);  //  Google
		System.out.println(arr2[0]);  // gmail
		System.out.println(arr2[1]);   // gmail.com

		//* % ^ & ( ) -- you cannot use as delimiter		
		
		
		
		
	}

}
