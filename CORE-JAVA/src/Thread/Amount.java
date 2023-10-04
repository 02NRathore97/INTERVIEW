package Thread;

public class Amount {
	private double balance;

	public double getBalance() {
		delay();
		return balance;
	}

	public void setBalance(double balance) {
		
		this.balance = balance;
	}

	public  void deposit(String msg, double amt) {
		double bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + "new balance" + bal);
	}

	public void delay() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}
