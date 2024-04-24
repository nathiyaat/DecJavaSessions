package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {

	static WebDriver driver ;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		
		By name = By.id("Form_getForm_Name");
		By bus_email= By.id("Form_getForm_Email");

		driver.get("https://orangehrm.com/30-day-free-trial/");	
		
		//ele 1 : 10 secs
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement fName =	wait.until(ExpectedConditions.presenceOfElementLocated(name));
		
		//fName.sendKeys("testing");
		//waitForElePresence(name,10).sendKeys("nathit");;
		//getElement(bus_email).sendKeys("test@gmail.com");
		
		waitForeleVisible(name, 10).sendKeys("testing");
		
		//ele 2 : 0 secs
		//driver.findElement(By.cssSelector("#Form_getForm_Email")).sendKeys("test@gmail.com");
		
	}
	 /**
	   * An expectation for checking that an element is present on the DOM of a page. This does not
	   * necessarily mean that the element is visible.
	   *
	   * @param locator used to find the element
	   * @return the WebElement once it is located
	   */
	public static WebElement waitForElePresence(By locator,int timeouts) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		return 	wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
		
	}
	  /**
	   * An expectation for checking that an element is present on the DOM of a page and visible.
	   * Visibility means that the element is not only displayed but also has a height and width that is
	   * greater than 0.
	   *
	   * @param locator used to find the element
	   * @return the WebElement once it is located and visible
	   */
	
	public static WebElement waitForeleVisible(By locator,int timeouts) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		return 	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
