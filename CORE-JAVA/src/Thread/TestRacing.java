package Thread;

public class TestRacing {

	public static void main(String[] args) {
		RacingCondition r = new RacingCondition("Ram");
		RacingCondition r1 = new RacingCondition("Shyam");
		r.start();
		r1.start();
	}

}
