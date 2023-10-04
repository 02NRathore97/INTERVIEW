package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LottaryStreamExampleTest {

	public static void main(String[] args) {
		List<LottaryStreamExample> l = new ArrayList<LottaryStreamExample>();
		
		l.add(new LottaryStreamExample("9111388906", "Neeraj"));
		l.add(new LottaryStreamExample("9111388908", "Amit"));
		l.add(new LottaryStreamExample("9111388907", "Abhay"));
		l.add(new LottaryStreamExample("9111388905", "Vinod"));
		l.add(new LottaryStreamExample("9111388903", "Yash"));
		
		
		l.stream()
			//.map(e->e.getNo())
			.map(e->e.getName())
			//.filter(e->e.length()==10)
			.distinct()
			.collect(Collectors.collectingAndThen(Collectors.toList(),e->{Collections.shuffle(e);return e.stream();}))
			.limit(3)
			.forEach(e->System.out.println(e));
	}

}
