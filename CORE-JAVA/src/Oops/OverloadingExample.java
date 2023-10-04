package Oops;

public class OverloadingExample {
	public void sum(int a , int b) {
		System.out.println(a+b);
	}
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void sum(int a, double b) {
		System.out.println(a+b);
	}
//	public int sum(int a, int b) {
//		System.out.println(a+b);
//		}
	public static void main(String[] args) {
		OverloadingExample s = new OverloadingExample();
		
		s.sum(10, 10);
		s.sum(10, 10.0);
		s.sum(10, 10, 10);
	}
}
