package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEvenOdd {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		Stream<Integer> stream = l.stream();
		stream.filter(e-> e%2==0).forEach(e -> System.out.println(e));
	}

}
