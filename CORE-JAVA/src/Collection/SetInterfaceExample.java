package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterfaceExample {

	public static void main(String[] args) {
		Set a = new HashSet();
		//Set a = new LinkedHashSet();
		
		
		Set b = new TreeSet();
		
		//SortedSet a = new TreeSet();
		
		a.add("Neeraj");
		a.add("a");
		a.add("b");
		a.add("b");
		a.add(null);
		
		System.out.println(a);
		
		System.out.println(b.isEmpty());
		
		
	}

}
