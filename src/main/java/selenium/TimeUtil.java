package selenium;

public class TimeUtil {

	private final static int DEFAULT_TIME=500;
	private final static int DEFAULT_SHORT_TIME=2000;
	private final static int DEFAULT_MEDIUM_TIME=5000;
	private final static int DEFAULT_LONG_TIME=10000;
	private final static int MAX_LTIME=15000;
	
	
	public static void applyWait(int waitTime) {
		
		try {
			Thread.sleep(waitTime*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void defaultTime() {
		try {
			Thread.sleep(DEFAULT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	public static void shortTime() {
		try {
			Thread.sleep(DEFAULT_SHORT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void mediumTime() {
		try {
			Thread.sleep(DEFAULT_MEDIUM_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	}
	public static void longTime() {

		try {
			Thread.sleep(DEFAULT_LONG_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	}
	public static void maxTime() {
		try {
			Thread.sleep(MAX_LTIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

}
