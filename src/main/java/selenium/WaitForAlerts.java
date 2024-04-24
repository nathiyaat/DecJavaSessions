package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlerts {
static WebDriver driver;
	public static void main(String[] args) {
 driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Alert alert =wait.until(ExpectedConditions.alertIsPresent());
	}

	
	public static Alert waitForJSAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static String getAlertTxt(int timeout) {
		return waitForJSAlert(timeout).getText();
	}
	public static void acceptAlertTxt(int timeout) {
		 waitForJSAlert(timeout).accept();
	}
	public static void dismissAlertTxt(int timeout) {
		 waitForJSAlert(timeout).dismiss();
	}
	public static void alerSendkeys(int timeout,String value) {
		 waitForJSAlert(timeout).sendKeys(value);
	}
	
	
}
