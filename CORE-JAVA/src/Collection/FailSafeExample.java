package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
//		Stack s = new Stack();
//		s.add(1);
//		s.add(2);
//		s.add(3);
//		
//		Iterator it = s.iterator();
//		s.add(4);
//		while (it.hasNext()) {
//			System.out.println(it.next()); //ConcurrentModificationException
//			
//		}
		
		
//		Stack s = new Stack();
//		s.add(1);
//		s.add(2);
//		s.add(3);
//		
//		Enumeration e = s.elements();
//		s.add(3);
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//			
//		}
		
		
//		ArrayBlockingQueue a = new ArrayBlockingQueue(5);
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		Iterator it = a.iterator();
//		a.add(4);
//		while (it.hasNext()) {
//			System.out.println(it.next()); 
//			
//		}
		
		
		ConcurrentHashMap a = new ConcurrentHashMap();
		a.put(1,"Neeraj");
		a.put(2, "Amit");
		a.put(3,"Vinod");
		Iterator it = a.values().iterator();
		a.put(4,"Abhay");
		while (it.hasNext()) {
			System.out.println(it.next()); 
			
		}
	}

}
