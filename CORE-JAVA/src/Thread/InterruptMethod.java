package Thread;

public class InterruptMethod extends Thread{
	@Override
	public void run() {
		try {
		for(int i=0; i<5; i++) {
			System.out.println("Thread is Running");
			
				Thread.sleep(1000);
			
		}
		} catch (InterruptedException e) {
			System.out.println("Thread is Terminated......");
		}
	}
	public static void main(String[] args) {
		InterruptMethod t1 = new InterruptMethod();
		
		t1.start();
		t1.interrupt();
		
	}

}
