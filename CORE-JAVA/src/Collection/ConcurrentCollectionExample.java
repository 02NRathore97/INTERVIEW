package Collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionExample extends Thread{
	private static ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<>();
	
	public void Run() {
		hm.put("four", 4);
	}
	
	
	public static void main(String[] args) {
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		
		ConcurrentCollectionExample t1 = new ConcurrentCollectionExample();
		t1.start();
		
		for(Object o : hm.entrySet()) {
			System.out.println(o);
		}
		
			System.out.println(hm);
	}

}
