package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
	//	driver.get("http://mrbool.com/");
		
		driver.get("https://www.spicejet.com/");
		
//		WebElement contentLink = driver.findElement(By.className("menulink"));
//		Actions act = new Actions(driver);
//		act.moveToElement(contentLink).perform();
//		
//		//Thread.sleep(5000);		
//		driver.findElement(By.xpath("//a[text()='Courses']")).click();
		
		//By mainMenu = By.className("menulink");
		//By subMenu = By.linkText("COURSES");
		//handleMouseHover(mainMenu,subMenu);
		
		By mainMenu = By.xpath("//div[text()='Add-ons']");
		By subMenu = By.xpath("//div[text()='Visa Services']");
		handleMouseHover(mainMenu,subMenu);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void handleMouseHover(By parentMenu, By subMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		
		Thread.sleep(2000);
		getElement(subMenu).click();	
		
	}
	

}
