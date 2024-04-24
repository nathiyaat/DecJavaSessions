package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[contains(@href,'twitter.com')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if(wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
			//1st fetch window ids
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> setItrtr= handles.iterator();
			
			String parentWindow = setItrtr.next();
			System.out.println("parent window "+parentWindow);
			
			String childWindow = setItrtr.next();
			System.out.println("child window "+childWindow);
			
		}
		
	}

}
