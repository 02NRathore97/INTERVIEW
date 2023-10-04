package Thread;

public class SleepThreadB {

	public static void main(String[] args) throws InterruptedException{
		SleepThreadA t = new SleepThreadA();
		t.start();
		//t.fun();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Rathore");
			Thread.sleep(1000);
		}
	}

}
