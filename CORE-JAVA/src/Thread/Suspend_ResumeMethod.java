package Thread;

public class Suspend_ResumeMethod extends Thread{
	@Override
	public void run() {
		String name = currentThread().getName();
		for (int i = 0; i <3; i++) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Suspend_ResumeMethod t1 = new Suspend_ResumeMethod();
		Suspend_ResumeMethod t2 = new Suspend_ResumeMethod();
		Suspend_ResumeMethod t3 = new Suspend_ResumeMethod();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		
		t1.start();
		t2.start();
		
		t2.suspend();
		
		t3.start();
		
		t2.resume();
	}

}
