package Oops;

public class RectangleOverrideExample extends ShapeOverrideExample{
	public double length;
	public double width;
	
	public RectangleOverrideExample(double lenght, double width) {
		this.length = lenght;
		this.width = width;
	}
	
	@Override
	public double area() {
		return length*width;
	}
}
