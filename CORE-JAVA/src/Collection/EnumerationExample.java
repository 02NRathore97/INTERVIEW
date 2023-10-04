package Collection;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationExample {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		Enumeration e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
