package Collection_Set;

import java.util.HashSet;
import java.util.Set;

public class CheckElementInHashset {
	public static void main(String[] args) {
		Set<String>list=new HashSet<>();
		list.add("Pooja");
		list.add("Disha");
		list.add("Mangal");
		list.add("Samruddhi");
		String check="Pooja";
		System.out.println("Name " + check + " exists: " + list.contains(check));
		
	}

}
