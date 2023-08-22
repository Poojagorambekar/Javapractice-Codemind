package Collection_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertHashSetToArrayList {
	public static void main(String[] args) {
		Set<Integer>list=new HashSet<>();
		list.add(2);
		list.add(24);
		list.add(15);
		list.add(1);
		
		List<Integer>demo=new  ArrayList<>(list);
		System.out.println("ArrayList elements:");
		System.out.println(demo);
	
		
	}

}
