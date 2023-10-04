package Oops;

public class CircleOverrideExample extends ShapeOverrideExample{
	public double pi = 3.14;
	public double radius;
	
	public CircleOverrideExample(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return pi*radius*radius;
	}
}
