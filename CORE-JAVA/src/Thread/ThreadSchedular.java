package Thread;

public class ThreadSchedular extends Thread {

	
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0; i<3; i++ ){
			System.out.println(name);
		}
	}
	
	
	
	public static void main(String[] args) {
		ThreadSchedular t1 = new ThreadSchedular();
		ThreadSchedular t2 = new ThreadSchedular();
		ThreadSchedular t3 = new ThreadSchedular();
		
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
	
	
		t1.start();
		t2.start();
		t3.start();
	}

}
