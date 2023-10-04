package Exception;

public class WithdrawalAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double withdraw(double d) throws WithdrawalException {
		balance = balance - d;
		if(balance<2000){
			WithdrawalException e = new WithdrawalException("Amount is less than 2000.....");
			throw e;
		}		return balance;
	}
}
