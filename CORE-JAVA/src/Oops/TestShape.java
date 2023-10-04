package Oops;

public class TestShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		s[0] = new Circle();
		s[1] = new Rectangle(); 
		
//		s[0] = Shape.getShape(1);
//		s[1] = Shape.getShape(2);
		
		Circle c = (Circle) s[0];
		//c.setRadius(5);
		System.out.println(s[0].area());
		System.out.println(c.area());
		
		
		Rectangle r = (Rectangle) s[1];
		//r.setLength(10);
		//r.setWidth(10);
		System.out.println(s[1].area());
		System.out.println(r.area());
	
	
			 double a = area(s);
			 System.out.println(a);


}
	public static double area(Shape[] s) {
		double totalArea = 0;
		
		for(int i=0; i<s.length; i++) {
			totalArea += s[i].area();
		}
		return totalArea;
	} 
}