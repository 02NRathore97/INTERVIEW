package Basics;

public class TestFuncInterfaceLambaExp {

	public static void main(String[] args) {
		FuncInterface f = (a,b)->{return(a+b);};
		int a=12; 
		int b=13;
		System.out.println(f.sum(a, b));
	}

}
