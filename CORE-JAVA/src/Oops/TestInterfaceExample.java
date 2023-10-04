package Oops;

public class TestInterfaceExample {

	public static void main(String[] args) {
		
		
		//Approach-1
		InterfaceExample interfaceExample = new InterfaceExample() {
			double b = InterfaceExample.A;
			@Override
			public int sub(int a, int b) {
				
				return (a-b);
			}
			
			@Override
			public void add(int a) {
				System.out.println(a+b);
			}
		};
	interfaceExample.add(100);
	System.out.println(interfaceExample.sub(100, 50));
	
	
	//Approach-2
	InterfaceExampleImpl m = new InterfaceExampleImpl();
	m.add(20);
	System.out.println(m.sub(10, 5));
	}
}
