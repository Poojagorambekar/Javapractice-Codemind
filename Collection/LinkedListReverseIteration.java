package Collection;

import java.util.LinkedList;

public class LinkedListReverseIteration {
public static void main(String[] args) {
	LinkedList<String>fruits= new LinkedList<>();
     fruits.add("Apple");
     fruits.add("Orange");
     fruits.add("Grapes");

    
     System.out.println("Using regular for loop:");
     for (int i = fruits.size() - 1; i >= 0; i--) {
         String element = fruits.get(i);
         System.out.println(element);
     }
}
}
