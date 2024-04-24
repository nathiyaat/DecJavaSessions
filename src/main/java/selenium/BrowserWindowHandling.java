package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter.com')]")).click();
		Thread.sleep(2000);

		//1st fetch window ids
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> setItrtr= handles.iterator();
		
		String parentWindow = setItrtr.next();
		System.out.println("parent window "+parentWindow);
		
		String childWindow = setItrtr.next();
		System.out.println("child window "+childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println("child window url "+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("parent window url "+driver.getCurrentUrl());

		driver.quit();
		
		
	}

}
