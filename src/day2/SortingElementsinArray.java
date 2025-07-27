package day2;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {
		int a[]= {100,600,200,400,500};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a)); //[100, 600, 200, 400, 500]
		
		
		Arrays.sort(a);  //sort elements in array
		System.out.println("After sorting"); //After sorting
		System.out.println(Arrays.toString(a)); //[100, 200, 400, 500, 600]
	}

}
