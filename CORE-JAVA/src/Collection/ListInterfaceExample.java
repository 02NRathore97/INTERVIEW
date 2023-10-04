package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceExample {

	public static void main(String[] args) {
		List a = new ArrayList();
		//List a = new LinkedList();
		//List a = new Vector();
		//List a = new Stack();
		
		
		//Vector a = new Stack();
		
		
		a.add(101);
		a.add("Neeraj");
		a.add("Rathore");
		a.add(null);
		a.add("Rathore");
		
		System.out.println(a);
		
		a.add(1, "Abhay");
		System.out.println(a);
		System.out.println(a.get(1));
		a.set(1, "Kanak");
		System.out.println(a);
		
		System.out.println(a.subList(0, 4));
		System.out.println(a.indexOf("Neer"));
		System.out.println(a.indexOf("Neeraj"));
		System.out.println(a.lastIndexOf("Rathore"));
		
		System.out.println(a.remove(2));
		System.out.println(a);
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
