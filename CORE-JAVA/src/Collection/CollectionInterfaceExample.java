package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionInterfaceExample {

	public static void main(String[] args) {
		
		//List
		Collection a = new ArrayList();
		//Collection a = new LinkedList();
		//Collection a = new Vector();
		//Collection a = new Stack();
		
		
		
		//Set
		//Collection a = new HashSet();
		//Collection a = new LinkedHashSet();
		
		
		
		//Queue
		//Collection a = new PriorityQueue();
	
		
		a.add(101);
		a.add("Neeraj");
		a.add("Rathore");
		a.add(null);
		a.add(null);
		a.add("Rathore");
		
		System.out.println(a);
		System.out.println(a.contains(101));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.getClass());
		System.out.println(a.remove(3));
		boolean remove = a.remove(3);
		//a.clear();
		//System.out.println(a);
		
		
		
		
		
		Collection b = new ArrayList();
		b.add(102);
		b.add("Amit");
		b.add("Rathore");
		
		b.addAll(a);
		System.out.println(b);
		
		
		Iterator it = b.iterator();
		while(it.hasNext()) {
			//System.out.println(it.hasNext());
			System.out.println(it.next());
			//Object obj = it.next();
			//System.out.println(obj);
		}
		
	}

}
