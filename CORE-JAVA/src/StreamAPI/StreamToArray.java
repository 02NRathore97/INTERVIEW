package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {
		Stream s = Stream.of(1,4,5,6,8);
		//s.forEach(System.out::println);
		
		Object[] s1 = s.toArray();
		
		System.out.println(Arrays.toString(s1));
	}

}
