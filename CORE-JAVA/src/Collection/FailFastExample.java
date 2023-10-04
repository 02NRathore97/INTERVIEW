package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		
		Iterator it = a.iterator();
		a.add(4);
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
