package Oops;

public class TestAbstractExampleImpl extends AbstractExample {

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		TestAbstractExampleImpl testAbstractExampleImpl = new TestAbstractExampleImpl();
		System.out.println(testAbstractExampleImpl.add(10,20));
	}

	

}
