package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestStudentComparable {

	public static void main(String[] args) {
		//List<Student> list = Arrays.asList(new Student(101,"Neeraj"), new Student(102, "Amit"));
		
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(102, "Neeraj"));
		list.add(new Student(102, "Amit"));
		
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}
