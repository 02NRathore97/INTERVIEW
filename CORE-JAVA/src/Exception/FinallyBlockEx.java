package Exception;

public class FinallyBlockEx {
	public static void main(String[] args) {
		try {
			int i = 10/0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException........");
		}finally {
			System.out.println("This is finally block...........");
		}
	}
}
