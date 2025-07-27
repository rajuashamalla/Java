package day2;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
	//	char s[]= {'D','C','B','A'};
		
		String s[]= {"ironman","batman","superman","hulk","thor"};
		System.out.println("Before sorting...."+ Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting...."+ Arrays.toString(s));

	}

}
