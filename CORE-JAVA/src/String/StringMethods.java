package String;

public class StringMethods {
	public static void main(String[] args) {
		
		String name = "Neeraj Singh Rathore";
		
		//Methods of String
		
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		System.out.println(name.charAt(10));
		System.out.println(name.substring(0, 10));
		System.out.println(name.substring(10));
		System.out.println(name.concat(" ji"));
		System.out.println("Mr ".concat(name));
		System.out.println(name.startsWith("N"));
		System.out.println(name.startsWith("S"));
		System.out.println(name.startsWith("n"));
		System.out.println(name.startsWith("S",7));
		System.out.println(name.endsWith("e"));
		System.out.println(name.endsWith("E"));
		System.out.println(name.indexOf("S"));
		System.out.println(name.indexOf("Singh"));
		System.out.println(name.indexOf("S", 10));
		System.out.println(name.indexOf("S", 5));
		System.out.println(name.lastIndexOf("S"));
		System.out.println(name.lastIndexOf("r"));
		System.out.println(name.replace("N", "Dh"));
	}
}
