package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSortingByName {

	public static void main(String[] args) {
		List<SortingByName> list = new ArrayList<SortingByName>();
		list.add(new SortingByName(1, "Neeraj"));
		list.add(new SortingByName(2, "Amit"));
		list.add(new SortingByName(3, "Vinod"));
		
		Stream<SortingByName> stream = list.stream();
		
		stream.sorted(Comparator.comparing(SortingByName::getName))
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e.getId()+" = "+e.getName()));
		
	}

}
