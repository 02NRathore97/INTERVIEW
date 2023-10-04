package Thread;

public class StopMethod extends Thread{
	@Override
	public void run() {
		String name = currentThread().getName();
		for(int i=0; i<3; i++) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		StopMethod t1 = new StopMethod();
		StopMethod t2 = new StopMethod();
		StopMethod t3 = new StopMethod();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		
		t1.start();
		t2.start();
		t2.stop();
		t3.start();
		
		
	}

}
