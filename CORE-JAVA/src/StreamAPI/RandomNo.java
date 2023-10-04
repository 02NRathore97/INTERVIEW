package StreamAPI;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNo {
	public static void main(String[] args) {
		
		 Stream.generate(Math::random).limit(4).forEach(e->System.out.println(e*100));
		
	}
}
