package Oops;

public class TestChild {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parent();
		
		
		Parent parent1 = new Child();
		parent1.parent();
		
		
		
		Child child = (Child)parent1;
		child.child();
		

		
		
	}

}
