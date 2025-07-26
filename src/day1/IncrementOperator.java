package day1;

public class IncrementOperator {

	public static void main(String[] args) {
		// ++ is called increment operator
		//case 1
		/*
		int a=10;
		System.out.println(a); //10
		
		 a++;    //a=a+1;
		System.out.println(a); //11
		*/
		//case 2 post increment 
		/*int a=10;
		int res=a++;
		System.out.println(res); //10 because first assignment 
		System.out.println(a); //1 second increment
		*/
		// case 3  pre increment operator
		int a=10;
		int res=++a;
		System.out.println(res); //11   // first increment and the asssign
		System.out.println(a); //11
		
		
		
	}

}
