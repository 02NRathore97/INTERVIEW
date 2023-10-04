package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamSecondHightestSalary {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5000);
		list.add(10000);
		list.add(15000);
		list.add(25000);
		
		list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(e->System.out.println(e));
	}

}
