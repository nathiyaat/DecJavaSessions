package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMultilevelMenu {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();			
			driver.get("https://www.bigbasket.com/");
			
			By level_1_menu =By.xpath("//span[contains(text(),'Shop By')]");
			By level_2_menu =By.linkText("Beverages");
			By level_3_menu =By.linkText("Tea");
			By level_4_menu =By.linkText("Green Tea");
			handleMouseHover4Menu(level_1_menu,level_2_menu,level_3_menu,level_4_menu);
			
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void handleMouseHover4Menu(By level1menu, By level2menu,By level3menu,By level4menu) throws InterruptedException {
		getElement(level1menu).click();
		Thread.sleep(2000);		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level2menu)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(level3menu)).perform();
		Thread.sleep(2000);		
		
		getElement(level4menu).click();	
	}
	
	
}
