package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
