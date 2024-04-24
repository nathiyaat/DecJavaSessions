package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultiWindowHandling {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		String parentWindowid = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

		
		Thread.sleep(2000);

		//1st fetch window ids
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it =handles.iterator();
		while(it.hasNext()) {
			
			String next =it.next();
			driver.switchTo().window(next);
			System.out.println("next window url "+driver.getCurrentUrl());
			
			if(!next.equals(parentWindowid)) {
				driver.close();
			}
			Thread.sleep(2000);
		}
		driver.switchTo().window(parentWindowid);
		System.out.println("current url "+driver.getCurrentUrl() +"" +driver.getTitle());
		
		
		
		
		
	}

}
