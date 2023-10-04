package Basics;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] t = {30,20,5,10};
		int temp=0;
		int c = 0;
		for(int i = 0;i<t.length; i++) {
			if(temp <t[i]) {
				c = temp;
				temp = t[i];
				
			}
			if(c<t[i] && temp>t[i]) {
				c = t[i];
			}
		}
		System.out.println(c);

	}

}
