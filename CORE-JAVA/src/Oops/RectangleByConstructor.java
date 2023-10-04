package Oops;

public class RectangleByConstructor extends Shape{
	public double length;
	public double width;
	
	public RectangleByConstructor(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
}
