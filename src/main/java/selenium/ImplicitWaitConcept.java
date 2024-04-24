package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //sel 3 @Deprecated
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sel 4.x
		
		
		//total time out = 10 secs
		driver.get("https://orangehrm.com/30-day-free-trial/");
		
		//login page
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("test"); //e1 10 secs
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("test@gmail.com"); //e1 10 secs  
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9987678756"); //e1 10 secs		
		
		
		//e2  10
		//e3 10
		//e4
		//e....n
		
		//home page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//15 secs for each and every ele
		//he1 15 secs
		//he2  15 secs
		
		//login page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Reg page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//cart page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		
		
	}

}
