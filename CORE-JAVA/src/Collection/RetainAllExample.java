package Collection;

import java.util.ArrayList;
import java.util.List;

public class RetainAllExample {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add(null);
		
		System.out.println(a);
		
		
		List<String> a1 = new ArrayList<String>();
		a1.add("1");
		a1.add("3");
		a1.add("4");
		a1.add(null);
		
		System.out.println(a1);
		
		a1.retainAll(a);
		
		System.out.println(a1);
	}

}
