package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class StreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("two","one","one","four");
		
		//list.stream().forEach(i->System.out.println(i));
		//list.stream().forEach(i->{System.out.println(i);});
		
		
//		list.stream().sorted().forEach(i->System.out.println(i));
		
//		list.stream().map(i->i.toUpperCase()).forEach(e->System.out.println(e));
		
//		list.stream().filter(e->e.startsWith("t")).map(i->i.toUpperCase()).forEach(System.out::println);
	
//		list.stream().distinct().forEach(i->System.out.println(i));
		
		
		
		
		List<Integer> l1 = Arrays.asList(2,4,3,10,5,8);
		List<Integer> list1 = l1.stream().filter(i->(i%2==0)).collect(Collectors.toList()); 
		System.out.println(list1);
	}

}
