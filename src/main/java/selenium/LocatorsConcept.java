package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		//driver.findElement(By.xpath()).click();
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//By locator approach
		By emailID = By.id("input-email");
		By pwd = By.id("input-password");

		//WebElement email=driver.findElement(emailID);
		//WebElement passwd=driver.findElement(pwd);

		//email.sendKeys("test@gmail.com");
		//passwd.sendKeys("test@123");
		
		//4.By locator with some utility
		
		//5.By locator with element util + Action util
		//dosendKeys(emailID, "test@gmail.com");

		//dosendKeys(pwd, "test@123");
		
		//6. by locator with elemnt util + action util
		ElementUtils ele = new ElementUtils(driver);
		//ele.dosendKeys(emailID, "test@gmail.com");
		//ele.dosendKeys(pwd, "test@123");
		
		//8. By util +string locators
		
		String uname_id="input-email";
		String pwd_id ="input-password";
		
		ele.dosendKeys("id", uname_id, "test@gmail.com");
		ele.dosendKeys("id", pwd_id, "test@123");

		

	}
		
	
}
