package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceExample {

	public static void main(String[] args) {
		SortedSet a = new TreeSet();
		
		a.add("c");
		a.add("b");
		a.add("e");
		a.add("e");
		a.add("a");
		a.add("d");
		//a.add(null);
		
		System.out.println(a);
		System.out.println(a.first());
		System.out.println(a.last());
		System.out.println(a.tailSet("c"));
		System.out.println(a.headSet("c"));
		System.out.println(a.subSet("a", "e"));
	}

}
