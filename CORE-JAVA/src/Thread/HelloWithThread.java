package Thread;

public class HelloWithThread extends Thread{
	//attributes
	String name = null;
	
	//parameterized constructor
	public HelloWithThread(String name) {
		super();
		this.name = name;
	}


	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println(i +" = "+ name);
		}
	}
	public static void main(String[] args) {
		//Create threads
		HelloWithThread t1 = new HelloWithThread("Ram");
		HelloWithThread t2 = new HelloWithThread("Shyam");
		
		
		//start threads
		t1.start();
		t2.start();
		
		//Main method is itself thread
		for(int i = 0; i<5; i++) {
			System.out.println(i +" = I am main method.....");
		}
	}

}
