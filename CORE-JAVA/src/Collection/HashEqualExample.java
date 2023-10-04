package Collection;

public class HashEqualExample {

	public static void main(String[] args) {
		String name = "Neeraj";
		String name1 = "Neeraj";
		String name2 = new String("Neeraj");
		
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(name1.hashCode());
		
		if(name.equals(name1)) {
			System.out.println("Equals Equal");
		}
		if(name.equals(name2)) {
			System.out.println("Equals Equal");
		}
		
		
		
		if(name==name1) {
			System.out.println("== Equal");
		}
		if(name==name2) {
			System.out.println("== Equal");
		}
		
		
		
		
		if(name.hashCode()==name1.hashCode()) {
			System.out.println("Hash Equal");
		}
		if(name.hashCode()==name2.hashCode()) {
			System.out.println("Hash Equal");
		}
	}

}
