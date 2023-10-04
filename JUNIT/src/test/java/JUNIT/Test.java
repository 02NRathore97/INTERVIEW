package JUNIT;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import JUNITMethods.Add;

public class Test {
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("Before Class");
	}
	@Before
	public void testBefore() {
		System.out.println("Before");
	}
	
	@org.junit.Test
	public void testAdd() {
		System.out.println(Add.add(10, 5));
	}
	@After
	public void testAfter() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("After Class");
	}
	
	
}