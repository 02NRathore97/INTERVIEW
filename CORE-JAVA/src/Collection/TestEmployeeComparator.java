package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparator {

	public static void main(String[] args) {
		
			List<Employee> list = Arrays.asList(new Employee(101,"Neeraj", 10000), new Employee(101, "Amit", 20000), new Employee(101, "Vinod", 20000) );
			//Collections.sort(list, new SortByName());
			//Collections.sort(list, new SortBySalary());
			
			
			
//			//String s1 = "SortByName";
//			//String s1 = "SortBySalary";
//			
//			
//			
//			if(s1.equals("SortByName")) {
//				Collections.sort(list, new SortByName());
//				 
//			}else {
//				Collections.sort(list, new SortBySalary());
//			}
			
			
			Collections.sort(list, new SortByIdAndNameDecsending());
			
			list.forEach(System.out::println);
	}

}
