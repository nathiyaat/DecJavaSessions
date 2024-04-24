package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CascadedClassConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("nathiya@gmail.com");
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test");
		
		driver.findElement(By.cssSelector("input.login-email")).sendKeys("test");
	}

}
