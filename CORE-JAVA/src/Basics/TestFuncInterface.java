package Basics;

public class TestFuncInterface {

	public static void main(String[] args) {
		FuncInterface f = new FuncInterface() {
			public int sum(int a, int b) {
				return (a+b);
			}
		};
		
		int a=12;
		int b=13;
		System.out.println(f.sum(a, b));
		FuncInterface.multi(a, b);
		f.sub(a, b);
	}

	}


