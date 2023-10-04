package Thread;

public class PriorityThread extends Thread{
	
		//parameterized constructor
		public PriorityThread(String name) {
			super(name);
		}


		public void run() {
			for(int i = 0; i<10; i++) {
				System.out.println(getName() +" P = "+getPriority());
			}
		}
		public static void main(String[] args) {
			//Create threads
			PriorityThread t1 = new PriorityThread("Thread#A");
			PriorityThread t2 = new PriorityThread("Thread#B");
			PriorityThread t3 = new PriorityThread("Thread#C");
			
			t1.setPriority(10);
			t2.setPriority(1);
			//t3 has a default priority 5
			
			//start threads
			t1.start();
			t2.start();
			t3.start();
			
		}

	}

