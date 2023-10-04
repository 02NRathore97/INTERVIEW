package Thread;

public class HelloRunnable implements Runnable{
	//attributes
	String name = null;
	
	//Parameterized constructor
	public HelloRunnable(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println(i+" = "+name);
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new HelloRunnable("Neeraj"));
		Thread t2 = new Thread(new HelloRunnable("Rathore"));
	
		t1.start();
		t2.start();
	}

	

}
