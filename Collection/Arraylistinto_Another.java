package Collection;

import java.util.ArrayList;

public class Arraylistinto_Another {
	public static void main(String[] args) {
		ArrayList<String>subject=new ArrayList<>();
		subject.add("Computer Network");
		subject.add("Operating System");
		subject.add("Database");
		subject.add("Data Structure");
	
		ArrayList<String>demo=new ArrayList<>();
		for(String list:subject)
		{
			demo.add(list);
			System.out.println(list);
		}
		
	}

}
