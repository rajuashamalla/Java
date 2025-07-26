package day1;

public class TernaryOperator {

	public static void main(String[] args) {
		// var=exp? result 1: result 2;
	/*	//ex1
		int a=400, b=200;
		int x=(a>b)? a: b;
		System.out.println(x); //400
	*/	
		// ex2
		int x=(1==1)? 100:200;
		System.out.println(x); //100
		
		//exp3
		int person_age=30;
		String res=(person_age>=18)? "Eligible" : "Not Eligible";
		System.out.println(res); //Eligible
		
	}

}
