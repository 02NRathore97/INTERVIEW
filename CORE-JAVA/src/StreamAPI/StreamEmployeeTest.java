package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeTest {

	public static void main(String[] args) {
		ArrayList<StreamEmployee> list = new ArrayList<StreamEmployee>();
		list.add(new StreamEmployee(17, "Neeraj"));
		list.add(new StreamEmployee(20, "Amit"));
		
		list.stream().filter(i->i.getAge()>18).distinct().collect(Collectors.toList()).forEach(e->System.out.println(e));
	}

}
