package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDescending {
	public static void main(String[] args) {
		
		ArrayList<Integer> value=new ArrayList<>();
		value.add(2);
		value.add(4);
		value.add(24);
		value.add(62);
		value.add(30);
		value.add(16);
		
       value.sort(Collections.reverseOrder());
       System.out.println(value);

	}

}
