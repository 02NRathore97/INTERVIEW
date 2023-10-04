package Oops;

public class TestDeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException{
		Address1 a = new Address1();
		a.setCity("Indore");
		
		
		Employee1 e = new Employee1();
		e.setName("Neeraj");
		e.setAddress1(a);
		
		
		System.out.println(e.getName());
		System.out.println(e.getAddress1().getCity());
	
		
		
		Address1 a1 = (Address1) a.clone();
		a1.setCity("Bhopal");
		
		Employee1 e1 = (Employee1) e.clone();
		e1.setName("Amit");
		e1.setAddress1(a1);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAddress1().getCity());
	
		
	}
}
