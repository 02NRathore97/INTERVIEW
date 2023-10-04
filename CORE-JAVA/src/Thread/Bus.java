package Thread;

public class Bus implements Runnable {
	int passenger;
	int available = 2;
	public Bus(int passenger) {
		this.passenger = passenger;
	}
	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		if (available>=passenger) {
			System.out.println(name +" Seat is Reserved !");
			available = available-passenger;
		} else {
			System.out.println("Seat is not available......");
		}
	}
	
	public static void main(String[] args) {
		Bus b = new Bus(1);
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("Ram");
		t2.setName("Neeraj");
		t3.setName("Vinod");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
