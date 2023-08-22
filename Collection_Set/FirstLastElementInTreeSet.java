package Collection_Set;

import java.util.TreeSet;

public class FirstLastElementInTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> treeset= new TreeSet<>();
	        treeset.add(10);
	        treeset.add(50);
	        treeset.add(90);
	        treeset.add(40);
	        
	       System.out.println(treeset);
	       
	       Integer first=treeset.first();
	       Integer last=treeset.last();
	       System.out.println(first);
	       System.out.println(last);
	     
	}

}
