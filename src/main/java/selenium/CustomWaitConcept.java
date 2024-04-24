package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email11");
		//retryingElement(email, 10).sendKeys("nathiya@gamil.com");
		retryingElement(email, 10,2).sendKeys("nathiya@gamil.com");

		
		
	}
	
	
	public static WebElement retryingElement(By locator, int timeout) {
		
		WebElement ele=null;
		int attempts =0;
		
		while(attempts<timeout) {
			
			try {
				ele =driver.findElement(locator);	
				System.out.println("element is found ..."+locator+"in attempt "+attempts);
			}
			catch(NoSuchElementException e) {
				System.out.println("no element is found ..."+ "in attempts "+attempts);
				TimeUtil.defaultTime();						
			}
			attempts++;
		}
		
		if(ele == null) {
			System.out.println("ele is not found for " +timeout +"times " +"in the interval of "+500 +" millseconds");
			throw new EleException("No Such Element");
		}
		return ele;
		
		
	}
	
	
public static WebElement retryingElement(By locator, int timeout, int intervaltime) {
		
		WebElement ele=null;
		int attempts =0;
		
		while(attempts<timeout) {
			
			try {
				ele =driver.findElement(locator);	
				System.out.println("element is found ..."+locator+"in attempt "+attempts);
			}
			catch(NoSuchElementException e) {
				System.out.println("no element is found ..."+ "in attempts "+attempts);
				TimeUtil.applyWait(intervaltime);			
			}
			attempts++;
		}
		
		if(ele == null) {
			System.out.println("ele is not found for " +timeout +"times " +"in the interval of "+intervaltime +" millseconds");
			throw new EleException("No Such Element");
		}
		return ele;
		
		
	}
	

}
