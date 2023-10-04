package Exception;

public class System_ExitExample {
	public static void main(String[] args) {
		
		try {
			int i = 10/0;
			System.out.println(i);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException........");
			
			System.exit(0);
		}finally {
			System.out.println("This is finally block.....");
		}
	}
}
