package Oops;

public class TestOverrideExample {

	public static void main(String[] args) {
		
			ShapeOverrideExample s = new CircleOverrideExample(5);
			ShapeOverrideExample s1 = new RectangleOverrideExample(10, 10);
			
			System.out.println("Circle area = " + s.area());
			System.out.println("Rectangle area = " + s1.area());
	}

}
