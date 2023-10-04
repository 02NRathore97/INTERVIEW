package Collection;

import java.util.Stack;

public class StackExample {

	
	//LIFO
	
	public static void main(String[] args) {
		Stack<String> s = new Stack();
		
		s.push("Z");
		s.push("A");
		s.push("C");
		s.push("D");
		System.out.println(s);
		
		String a = s.pop();
		String b = s.pop();
		String c = s.pop();
		String d = s.pop();
		
		Stack<String> s1 = new Stack();
		s1.push(a);
		s1.push(b);
		s1.push(c);
		s1.push(d);
		System.out.println(s1);
		
	}

}
