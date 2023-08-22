package Collection_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {
	public static void main(String[] args) {
		
		Set<Integer>list=new HashSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		 
		Integer[] array = list.toArray(new Integer[list.size()]);
		
       System.out.println("Converted Array");
       for(Integer element:list)
       {
    	   System.out.println(element);
       }

		
	}

}
