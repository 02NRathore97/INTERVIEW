package Thread;

public class DaemonThread extends Thread{
	@Override
	public void run() {
		System.out.println("Deamon Thread Started......"+currentThread().isDaemon());
		while(true) {
			try {
				Thread.sleep(3000);
				System.out.println("DaemonThread waked up......");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Main Started");
		DaemonThread d = new DaemonThread();
		
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Leaving main method");
		System.out.println("Exit from JVM");
	}

}
