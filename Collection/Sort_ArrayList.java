package Collection;


import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
        al.add("Disha");
        al.add("Pooja");
        al.add("Geeta");
        al.add("Riya");
        al.add("Kavya");
   
        Collections.sort(al);

        System.out.println(al);
	}

}
