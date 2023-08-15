package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratAll_Elements {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Rose");
		list.add("Lily");
		list.add("Sunflower");
		list.add("Tulip");
	
		 System.out.println("Using Iterator:");
	        Iterator<String>iterator=list.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	            
	        }
	        System.out.println("-----------------------------");
	       System.out.println("Using for-each loop ");
	       for(String item:list)
	       {
	    	   System.out.println(item);
	       }
	}

}
