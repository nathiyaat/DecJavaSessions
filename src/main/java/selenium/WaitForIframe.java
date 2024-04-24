package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForIframe {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		
		By locator = By.xpath("//iframe[contains(@id,'frame-one')]");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		
		
		waitforFrameandSwitchtoIt(locator,10);
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("56789");
		
		
	}
	
	public static void waitforFrameandSwitchtoIt(By frmaeLocator,int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frmaeLocator));
		
	}
	public static void waitforFrameandSwitchtoIt(int frameindex,int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
		
	}
	

}
