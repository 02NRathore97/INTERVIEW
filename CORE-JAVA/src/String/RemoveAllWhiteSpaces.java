package String;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
	String str ="  Ne  e ra  j   ";
	String name = str.replaceAll("\\s", "");
	System.out.println(name);

	}

}
