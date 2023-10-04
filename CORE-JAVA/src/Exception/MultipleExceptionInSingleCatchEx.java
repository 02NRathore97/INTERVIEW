package Exception;

public class MultipleExceptionInSingleCatchEx {

	public static void main(String[] args) {
		String name = "Java";
		try {
			System.out.println(name.charAt(5));
		} catch (StringIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Exception...........");
		}
	}

}
