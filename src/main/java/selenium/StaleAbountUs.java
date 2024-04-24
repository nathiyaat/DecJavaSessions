package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleAbountUs {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement pwd = driver.findElement(By.id("input-password"));

		email.sendKeys("nathiya@gmail.com");
		pwd.sendKeys("test@123");

		driver.findElement(By.linkText("About Us")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		email.clear();
		email.sendKeys("tom@gmail.com");
		pwd.sendKeys("test@123");
		
	}

}
