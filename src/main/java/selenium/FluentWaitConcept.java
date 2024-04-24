package selenium;

import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	public static void main(String[] args) {
		//wait(I) ---untill()---FluentWait(C)---WebDriverWait(I)
		
WebDriver driver = new ChromeDriver();
			
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		By img = By.cssSelector("div#imageTemplateContainer img11");
		
//	Wait<WebDriver>	 wait=new FluentWait<WebDriver>(driver)
//			.withTimeout(Duration.ofSeconds(10))  //total timeout
//			.pollingEvery(Duration.ofSeconds(2))  //polling every 2 secs
//			.ignoring(NoSuchElementException.class)
//			.withMessage("time out ... no ele presnt......");
//	
//	
//	WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(img));
//	ele.click();
		
		
		//using WebDriverWait with FluentWait features
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class)
		.ignoring(ElementNotInteractableException.class)
		.withMessage("no timeout... no element");
		
		WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(img));
		ele.click();
		
		
		//for alerts
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoAlertPresentException.class)
		.withMessage("no timeout... no alert");
		
		
		Wait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		
	}

}
