package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoading {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		boolean flag =isPageLoaded(10);
		if(!flag) {
			throw new BrowserException("PAGE IS NOT LOADED");
		}
		
	}

	
	public static boolean isPageLoaded(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		String state =wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'")).toString(); //returns JS "true"
		return Boolean.parseBoolean(state); //true
	}
	
}
