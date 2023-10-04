package Basics;

public class ArmsTest {

	public static void main(String[] args) {
		ArmsInterface armsInterface = (b)->{
			int sum = 0;
			int r;
			int a = b;
			
			while(b>0) {
				r = b%10;
				sum += (r*r*r);
				b = b/10;
			}
			if(sum == a) {
				System.out.println("Armstrong");
			}else {
				System.out.println("Not Armstrong");
			}
		};

		armsInterface.arms(153);
	}

}
