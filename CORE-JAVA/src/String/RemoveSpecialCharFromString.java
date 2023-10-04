package String;

public class RemoveSpecialCharFromString {
	public static void main(String[] args) {
		String name="$#@Ne%^&er*&^%$aj";
		String name1 = name.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(name1);
	}
	
}
