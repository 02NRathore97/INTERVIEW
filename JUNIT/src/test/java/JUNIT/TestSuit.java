package JUNIT;


import junit.framework.TestSuite;

public class TestSuit {
public static void main(String[] args) {
	junit.textui.TestRunner.run(getSuite());
}


public static TestSuite getSuite() {
	TestSuite suite = new TestSuite("TestAll");
	suite.addTestSuite(FirstCase.class);
	suite.addTestSuite(SecondCase.class);
	return suite;
}
}
