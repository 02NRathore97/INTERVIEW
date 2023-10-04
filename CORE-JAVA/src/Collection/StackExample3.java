package Collection;

import java.util.Stack;

public class StackExample3 {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		
		
		s.pop();
		s.pop();
		s.pop();
		
		System.out.println(s);
		
		
		
		
	}

}
