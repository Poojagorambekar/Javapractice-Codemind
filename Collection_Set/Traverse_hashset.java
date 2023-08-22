package Collection_Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Traverse_hashset {
	public static void main(String[] args) {
		Set<String>list=new HashSet<>();
		list.add("Rose");
		list.add("Lily");
		list.add("Sunflower");
		list.add("Tulip");
		list.add("Rose");
		
		System.out.println("Using Iterator:");
        Iterator<String>iterator=list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        
        }
        
     
            System.out.println("--------");
            
            System.out.println("Using for-each loop");
		
		
		for(String val:list)
		{
			System.out.println(val);
		}
	}
	}

