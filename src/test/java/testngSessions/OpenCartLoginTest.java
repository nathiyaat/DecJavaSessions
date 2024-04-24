package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest{
	
	@Test(priority =1)
	public void titleTest() {
		
		
		String title = driver.getTitle();
		System.out.println("title is "+title);
		Assert.assertEquals(title, "Account Login","title is not matched");
	
	}
	
	//5 bcz of alphabet h in headerTest
	@Test(priority =3)
	public void imageTest() {
		boolean flag =driver.findElement(By.xpath("//img[@alt='naveenopencart']")).isDisplayed();
		//Assert.assertEquals(flag, true);
		Assert.assertTrue(flag);

	}
	//11
	@Test(priority =2)
	public void urlTest() {
		String url =driver.getCurrentUrl();
	System.out.println("URL is "+url);
	Assert.assertTrue(url.contains("account/login"));
	
	}

}
