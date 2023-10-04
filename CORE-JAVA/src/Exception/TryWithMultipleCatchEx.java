package Exception;

public class TryWithMultipleCatchEx {

	public static void main(String[] args) {
		try {
			String name = "Java";
			System.out.println(name.charAt(5));
			System.out.println(name.length());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException..........");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException..........");
		}
	}

}
