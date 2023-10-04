package Basics;

public class MissingNumInArrays {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {10,20};
		int sum1 = 0;
		int sum2 = 0;
		for(int  i=0; i<a.length; i++) {
			sum1 +=a[i];
		}
		for(int  i=0; i<b.length; i++) {
			sum2 += b[i];
		}
		System.out.println(sum1-sum2);
	}

}
