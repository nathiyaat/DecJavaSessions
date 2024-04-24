package testngSessions;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount = 10,priority=2)
	public void createusrTest() {
		System.out.println("create usr Test");
	}
	@Test(priority=1)
	public void paymentTest() {
		System.out.println("paymentTest");
	}
}
