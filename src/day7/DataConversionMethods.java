package day7;

public class DataConversionMethods {

	public static void main(String[] args) {
		
	//String to int
//		String s="hello";  //cannot convert to int
//		String s1="10";
//		String s2="20";
//		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //30
		
       //String to double
	/*	String s1="10.2";
		String s2="12.8";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2)); //23.0
	*/
		//String to boolean
//		String s="true"; // other than true , if you pass any string that will return false.
//		System.out.println(Boolean.parseBoolean(s)); //true
		// string to vhar not possible
	//int, double, bool, char    to string
		int a=10;
		double d=16.7;
		char c='A';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		s=String.valueOf(bool);
		System.out.println(s);
		
		
	}

}
