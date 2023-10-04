package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,4,5,2,5,6);
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream().filter(n->!set.add(n)).forEach(e->System.out.println(e));
	}

}
