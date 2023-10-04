package Oops;

public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException{

		EmployeeConst e = new EmployeeConst("Neeraj");
		
		System.out.println(e.name);
		System.out.println(e.add.city);
		
		EmployeeConst e1 = (EmployeeConst)e.clone();
		e1.name = "Amit";
		e1.add.city = "Bhopal";
		
		System.out.println(e1.name);
		System.out.println(e1.add.city);
		
		
	}

}
