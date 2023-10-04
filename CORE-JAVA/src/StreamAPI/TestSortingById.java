package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSortingById {

	public static void main(String[] args) {
		List<SortingById> list = new ArrayList<SortingById>();
		list.add(new SortingById(1, "Amit"));
		list.add(new SortingById(2, "Neeraj"));
		
//		Stream<SortingById> stream = list.stream();
//		stream.sorted(Comparator.comparingInt(SortingById::getId))
//		.collect(Collectors.toList())
//		.forEach(e->System.out.println(e.getId()+" = "
//				+ ""+e.getName()));};
		
		
		
		Stream<SortingById> stream = list.stream();
		stream.sorted(Comparator.comparingInt(SortingById::getId).reversed())
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e.getId()+" = "
				+ ""+e.getName()));};

}
