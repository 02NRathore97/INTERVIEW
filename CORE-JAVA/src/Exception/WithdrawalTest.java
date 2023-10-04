package Exception;

public class WithdrawalTest {

	public static void main(String[] args) {
	
			WithdrawalAccount a = new WithdrawalAccount();
			a.setBalance(5000);
		try {
			a.withdraw(4000);
			System.out.println(a.getBalance());
		} catch (WithdrawalException e) {
			//System.out.println("Amount is less than 2000");
			System.out.println(e.getMessage());
		}
	}

}
