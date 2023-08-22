package Collection_Set;

import java.util.TreeSet;

public class NumberLessThan {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(1);
		set.add(10);
		set.add(4);
		set.add(5);
		set.add(8);
		set.add(3);
		set.add(15);
		set.add(5);
		
		for(Integer value :set)
		{
			if(value < 7)
			{
				System.out.println(value);
			}
		}
	}

}
