package Oops;

public class CircleByConstructor extends Shape{
	public double radius;
	public final double PI = 3.14;
	
	public CircleByConstructor(double radius) {
		this.radius = radius;
	}
	
	
	
	public double area() {
		return PI*radius*radius;
	}
}
