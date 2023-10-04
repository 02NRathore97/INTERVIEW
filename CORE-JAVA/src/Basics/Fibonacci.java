package Basics;

public class Fibonacci {

	public static void main(String[] args) {
		int f=0;
		int g=1;
		int c;
		
		for(int i=0; i<10; i++) {
			c=f+g;
			System.out.print(f+" ");
			f=g;
			g=c;
		}
	}

}
