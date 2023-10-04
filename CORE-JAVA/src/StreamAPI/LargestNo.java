package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class LargestNo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Integer integer = list.stream().max(Integer::compare).get();
		System.out.println(integer);
	}

}
