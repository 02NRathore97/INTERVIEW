package Collection;

import java.util.ArrayList;
import java.util.List;

public class RetainAllExample1 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("Bag");
		a.add("Pen");
		
		List<String> a1 = new ArrayList<String>();
		a1.add("Bag");
		a1.add("Book");
		
		a1.retainAll(a);
		
		
		System.out.println(a1);
	}

}
