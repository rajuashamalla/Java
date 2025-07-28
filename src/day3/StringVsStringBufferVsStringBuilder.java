package day3;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
	/*	// String- immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s);   // welcome  immutable, cannot change the original value
	*/
	/*	//StringBuffer - mutable
		StringBuffer s=new StringBuffer("welcome ");
		s.append("to java");
		System.out.println(s); //welcome to java
	*/
		
		//StringBuilder - mutable
		StringBuilder s=new StringBuilder("welcome ");
		s.append("to java");
		System.out.println(s); //welcome to java


	}

}
