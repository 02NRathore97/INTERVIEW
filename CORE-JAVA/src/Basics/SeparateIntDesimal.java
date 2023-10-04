package Basics;

import java.util.Arrays;

public class SeparateIntDesimal {

	public static void main(String[] args) {
		double[] a = {30.5, 20.5, 10.10};
		int[] x = new int[3];
		double[] y= new double[3];
		for(int i = 0; i<a.length; i++) {
			x[i] = x[i]+(int)a[i];
			y[i] = y[i]+a[i]%10;
			
		}
		System.out.print(Arrays.toString(x));
		System.out.print(Arrays.toString(y));
	}

}
