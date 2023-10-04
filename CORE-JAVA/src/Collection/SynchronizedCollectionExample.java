package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class SynchronizedCollectionExample extends Thread{
private static Map<String, Integer> hm = Collections.synchronizedMap(new HashMap<String, Integer>());
	
	public void Run() {
		hm.put("four", 4);
	}
	
	
	public static void main(String[] args) {
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		
		SynchronizedCollectionExample t1 = new SynchronizedCollectionExample();
		t1.start();
		
		for(Object o : hm.entrySet()) {
			System.out.println(o);
		}
		
			System.out.println(hm);
	}

}
