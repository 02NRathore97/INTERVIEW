package Oops;



public class TestShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		
		
		//creating the object of employee class
		Employee e = new Employee();
		e.setName("Neeraj");
		e.setAddress("Indore");
		
		
		Employee e1 = (Employee) e.clone();
		e1.setName("Amit");
		e1.setAddress("Bhopal");
		
		
		System.out.println(e.getName());
		System.out.println(e.getAddress());
		
		System.out.println(e1.getName());
		System.out.println(e1.getAddress());
	
		
		
	}

}
