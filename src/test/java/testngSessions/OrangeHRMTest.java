package testngSessions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{
	WebDriver driver;

	@Test(priority =2)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("title is "+title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM","title is not matched");
	
	}
	
	
	@Test(priority =1)
	public void urlTest() {
		String url =driver.getCurrentUrl();
	System.out.println("URL is "+url);
	Assert.assertTrue(url.contains("30-day-free-trial"));
	
	}
	
	
	
	
}
