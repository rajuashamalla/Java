package day09_Collections_ArrayList_HashSet_HashMap;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();

        mylist.add(100);
        mylist.add(100.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(null);

        //size if the arraylist
        System.out.println("Size of an ArrayList:"+mylist.size());//Size of an ArrayList:5

        
        //Printing Arraylist
        System.out.println("Printing data from arraylist:"+mylist);//Printing data from arraylist:[100, 100.5, Welcome, A, null]

        //Remove element from arraylist
        mylist.remove(2); // here 2 is index of element
        System.out.println("After Removing :"+mylist);//After Removing :[100, 100.5, A, null]
        
        //Insert element in the arraylist
        mylist.add(1,"hello");
        System.out.println("After insertion:"+ mylist);//After insertion:[100, hello, 100.5, A, null]
        
        //Modify element in the arraylist(modify/replace/change)
        mylist.set(2, "world");
        System.out.println("After replacing:"+mylist);//After replacing:[100, hello, world, A, null]

        //access specific element from arraylist
        System.out.println(mylist.get(2));//world
        
        //Reading all values from arraylist
        //using normal for loop
  /*      for(int i=0;i<mylist.size();i++)
        {
        	System.out.println( mylist.get(i));
        	
        }
    */    
      
        //using for each loop
        for(Object x:mylist)
        {
        	System.out.println(x);
        }
        
        // using iterator
        Iterator it=mylist.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        //checking arraylist empty or not
        
        System.out.println("Is arraylist empty?"+mylist.isEmpty());
        
        //remove all the elements from the arraylist
        ArrayList mylist2=new ArrayList();
        mylist2.add(100);
        mylist2.add("hello");
      
        
        mylist.removeAll(mylist2);
        System.out.println("After removing multiple elements:"+mylist2);
        
        
    }
}
