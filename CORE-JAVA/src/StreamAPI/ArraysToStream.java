package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class ArraysToStream {

	public static void main(String[] args) {
		String[] a = {"ram","shyam","sita","geeta"};
		
		Stream<String> s = Arrays.stream(a);
		//s.forEach(i->System.out.println(i));
		//s.forEach(System.out::println);
		
		s.sorted().forEach(System.out::println);
		s.sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
