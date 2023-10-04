package Basics;

import java.util.Arrays;


public class CopyArrayMethod {

	public static void main(String[] args) {
		String[] a = {"Neeraj","Amit","Vinod","Abhay"};
		String[] b = new String[2];
		
		System.arraycopy(a, 2, b, 0, 2);
		System.out.println(Arrays.toString(b));
	}

}
