package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Array_List {
	void iterateAlUsingIterator()	
	{

	    ArrayList<Integer>al=new ArrayList<>();
            al.add(5);
            al.add(20);
            al.add(15);
            al.add(25);
            al.add(5);
         Iterator<Integer>a2= al.iterator();
         while(a2.hasNext())
         {
        	Integer val= a2.next();
        	 System.out.println(val);
         }
            
	}
	
	
	
	public void alTest()
	{
		
	    ArrayList<Integer>al=new ArrayList<>();
            al.add(5);
            al.add(10);
            al.add(15);
            al.add(20);
            al.add(5);
            System.out.println(al);
            System.out.println(al.get(2));
            for (int i=0;i<al.size();i++)
            {
            	System.out.println(al.get(i));
            }
         
       
            
            HashSet<Integer> hs= new HashSet<>();
            hs.add(2);
            hs.add(10);
            hs.add(5);
            hs.add(2);
            hs.add(5);
            System.out.println(hs);
            
            
	}
	
	
	public static void main(String[] args) {
		
		Array_List al= new  Array_List();
		// al.alTest();
		al.iterateAlUsingIterator();
	}

}
