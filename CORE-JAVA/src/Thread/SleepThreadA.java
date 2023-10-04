package Thread;

public class SleepThreadA extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Neeraj");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	
	
//	public void fun() {
//		for(int i = 0; i<5; i++) {
//			System.out.println("Neeraj");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
	}
}
