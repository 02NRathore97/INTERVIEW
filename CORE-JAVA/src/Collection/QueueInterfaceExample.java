package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceExample {

	public static void main(String[] args) {
		Queue a = new PriorityQueue();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(3);
		//a.add(null);  //null pointer Exception
		
		//System.out.println(a);   //FIFO
		
		
		
		
		
//		Deque a = new ArrayDeque() ;
//		a.add(1);
//		a.add(2);
//		a.add(3);
		//a.add(null);
		
		System.out.println(a);
	}

}
