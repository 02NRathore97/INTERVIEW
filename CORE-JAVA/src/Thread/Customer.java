package Thread;

public class Customer {

	public static void main(String[] args) {
		
		//First Object
		Bank bank = new Bank(5000);

		Thread t1 = new Thread(bank);
		Thread t2 = new Thread(bank);

		t1.setName("Neeraj");
		t2.setName("Vinod");
		
		t1.start();
		t2.start();
		
		

		//Second Object
		Bank bank1 = new Bank(5000);

		Thread t3 = new Thread(bank1);
		Thread t4 = new Thread(bank1);

		t3.setName("Yash");
		t4.setName("Abhay");

		t3.start();
		t4.start();
	}

}
