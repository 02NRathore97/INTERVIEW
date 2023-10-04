package Oops;

public class TestShapByConstructor {

	public static void main(String[] args) {
		Shape []s =  new Shape[2];
		s[0] = new CircleByConstructor(5);
		s[1] = new RectangleByConstructor(10,10);
		
		CircleByConstructor c = (CircleByConstructor) s[0];
		RectangleByConstructor r = (RectangleByConstructor) s[1];
		
		System.out.println(c.area());
		System.out.println(r.area());
		
		System.out.println(area(s));
		
	}
	public static double area(Shape[] s) {
		double totalArea = 0;
		
		for(int i = 0; i<s.length; i++) {
			totalArea += s[i].area();
		}
		return totalArea;
	}

}
