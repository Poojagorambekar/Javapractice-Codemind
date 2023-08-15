package Collection;

import java.util.ArrayList;

public class CheckElementInArrayList {
public static void main(String[] args) {
	ArrayList<Integer> element=new ArrayList<>();
	element.add(10);
	element.add(20);
	element.add(30);
	element.add(40);
	element.add(50);
	int check=40;
	System.out.println("Element " + check + " exists: " + element.contains(check));
	
}
}
