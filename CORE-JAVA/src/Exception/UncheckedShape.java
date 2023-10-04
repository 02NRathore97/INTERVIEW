package Exception;

public class UncheckedShape {
	public static void main(String[] args) {
		shape();
	}
	
	public static void shape() {
		try {
			circle();
		} catch (Exception e) {
			System.out.println("Exception handled........");
		}
		
	}
	
	public static void circle() {
		arc();
	}
	public static void arc() {
		RuntimeException e = new RuntimeException();
		throw e;
	}
		
}
