package Collection;

import java.util.ArrayList;
import java.util.List;

public class HashCodeExample {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(1);
		a.add(2);
		int hashCode = a.hashCode();
		System.out.println(hashCode);
		System.out.println(a.hashCode());
	}

}
