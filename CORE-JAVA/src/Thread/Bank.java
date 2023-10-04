package Thread;

public class Bank extends Thread {
//	int balance = 5000;
//	int withdraw;

	static int balance = 5000;
	static int withdraw;

	public Bank(int withdraw) {
		this.withdraw = withdraw;
	}

//	@Override
//	public synchronized void run() {
//		String name = currentThread().getName();
//		if(withdraw<=balance) {
//			System.out.println(name +" Withdraw money....");
//			balance = balance-withdraw;
//		}else {
//			System.out.println("Insufficient fund......");
//		}
//	}

	public static synchronized void withdraw() {
		String name = currentThread().getName();
		if (withdraw <= balance) {
			System.out.println(name + " Withdraw money....");
			balance = balance - withdraw;
		} else {
			System.out.println("Insufficient fund......");
		}
	}
	@Override
	public void run() {
		withdraw();
	}
}
