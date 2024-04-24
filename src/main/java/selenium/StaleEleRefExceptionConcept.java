package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleEleRefExceptionConcept {

	public static void main(String[] args) {

		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("nathiya@gmail.com");
		
		driver.navigate().refresh();
		
		//email = driver.findElement(By.id("input-email")); //v2
		//email.sendKeys("tom@gmail.com"); //stale element reference: stale element not found

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.pollingEvery(Duration.ofMillis(500))
					.ignoring(StaleElementReferenceException.class)
					.withMessage("No element found");
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("tom@gmail.com");
		
		
		
		
		
	}

}
