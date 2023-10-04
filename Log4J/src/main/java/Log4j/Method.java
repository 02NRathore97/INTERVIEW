package Log4j;

import org.apache.log4j.Logger;

public class Method {
	private static Logger log = Logger.getLogger(Method.class);
	
	
	public void add(int a, int b) {
		log.info("Method add is started...........");
		System.out.println(a+b);
		log.info("Method add is ended..........");

	}
}
