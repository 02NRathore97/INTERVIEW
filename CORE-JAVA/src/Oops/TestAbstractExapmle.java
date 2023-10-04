package Oops;

public class TestAbstractExapmle {

	public static void main(String[] args) {

			AbstractExample abstractExample = new AbstractExample() {
				
				@Override
				public int add(int a, int b) {
					return a+b;
				}
			};
			int a = abstractExample.a = 10;
			int sum =  abstractExample.add(a, 20);
			System.out.println(sum);
	}

}
