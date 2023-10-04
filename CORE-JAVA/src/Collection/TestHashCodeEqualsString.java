package Collection;

public class TestHashCodeEqualsString {

	public static void main(String[] args) {
		HashCodeEqualsString a = new HashCodeEqualsString(1, "Neeraj", 5000);
		HashCodeEqualsString a1 = new HashCodeEqualsString(1, "Neeraj", 5000);
		
		if(a.equals(a1)) {
			if(a.hashCode()==a1.hashCode()) {
				System.out.println("equals");
			}else {
				System.out.println("not");
			}
		}
	}

}
