package day09_Collections_ArrayList_HashSet_HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		
		//Declaration
		HashSet myset=new HashSet();
	//	Set myset=new HashSet();
	//	HashSet <String>myset=new HashSet<String>();
		
	//adding elements into hashset
		myset.add(100);
		myset.add(12.6);
		myset.add(true);
		myset.add('A');
		myset.add(null);
		
		System.out.println(myset);//[null, A, 100, 12.6, true]
		
		
		//size of hashset
		System.out.println("size of hashset:"+ myset.size());

		//removing element
		myset.remove(12.6);// 12.6 is value (not an index)
		System.out.println("After removing:"+myset);//After removing:[null, A, 100, true]

		//Inserting element - not possible
		//Access specific element - not possible
		
		//Convert HashSet -- ArrayList
		ArrayList al=new ArrayList(myset);
		System.out.println(al);//[null, A, 100, true]
		System.out.println(al.get(2));//100
		
		//Read all the elements using for each loop
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		//Using Iterator
		Iterator <Object> it=myset.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
		
		//clearing all elements in hashset
				myset.clear();
			System.out.println(myset.isEmpty());//true	
	}

}
