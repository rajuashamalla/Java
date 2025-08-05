package day09_Collections_ArrayList_HashSet_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaration
	//	HashMap map=new HashMap();
	//	Map hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "ironman");
		hm.put(102, "superman");
		hm.put(103, "batman");
		hm.put(104, "spiderman");
		hm.put(105, "hulk");
		System.out.println(hm);//{101=ironman, 102=superman, 103=batman, 104=spiderman, 105=hulk}
		
		//size of hashmap
		System.out.println("Size of hashmap:"+hm.size());//Size of hashmap:5
		
		//remove pairs
		hm.remove(104);
		System.out.println("After removing pair:"+hm);//After removing pair:{101=ironman, 102=superman, 103=batman, 105=hulk}
		
		//access value of the key
		System.out.println(hm.get(102));// 102 is key //superman
		
		//get all the keys from hashmap
		System.out.println(hm.keySet());//[101, 102, 103, 105]

		System.out.println(hm.values());//[ironman, superman, batman, hulk]

		//Reading data from hashmap
		//using for....each 
		for(int k:hm.keySet())
		{
			System.out.println(k+"     "+hm.get(k));
		}
		
		//using iterator
		Iterator<Entry<Integer , String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}

		
		hm.clear();
		System.out.println(hm.isEmpty());//true
		
		
	}

}
