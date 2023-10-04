package Collection;

public class TestEqualAndHashExample {

	public static void main(String[] args) {
		EqualAndHashExample e = new EqualAndHashExample(24, "Neeraj", "Rathore");
		EqualAndHashExample e1 = new EqualAndHashExample(25, "Neeraj", "Rathore");
	
		
//		System.out.println(e.hashCode());
//		System.out.println(e1.hashCode());
		
		
		if(e.equals(e1)) {
			System.out.println("equals");
//			if(e.hashCode()== e1.hashCode()) {
//				System.out.println("Both the objects are equal");
//			}else {
//				System.out.println("Not Equal");
			}
			else {
				System.out.println("Not Equals");
			}
		}
	}


