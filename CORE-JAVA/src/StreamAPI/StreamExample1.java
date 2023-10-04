package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		String[] a = {"one","two","three"};
		
		Stream<String> s = Arrays.stream(a);
		
		s.map(i->i.toUpperCase()).filter(e->e.startsWith("T")).distinct().forEach(x->System.out.println(x));
	}

}
