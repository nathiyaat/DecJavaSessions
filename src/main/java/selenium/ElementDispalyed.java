package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDispalyed {

	static WebDriver driver;
	
ElementUtils ele = new ElementUtils(driver);
	public static void main(String[] args) {
		driver= new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
//		boolean flag=driver.findElement(By.className("img-responsive")).isDisplayed();
//		System.out.println(flag);
//		
//		if(flag) {
//			System.out.println("element displayed");
//		}
//		else {
//			System.out.println("element displayed");
//
//		}
		
//		By logo = By.className("img-responsive");
//		if(isEleDisplayed(logo)) {
//			System.out.println("logo is displayed");
//		}
//		else {
//			System.out.println("no logo found");
//		}
		
//		List<WebElement> logos = driver.findElements(By.className("img-responsive"));
//		if(logos.size()==1) {
//			System.out.println("logo is dispalyed");
//		}
//		else {
//			System.out.println("logo is not dispalyed");
//
//		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean isEleDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	
	public  boolean isEleExist(By locator) {
		if(ele.getElements(locator).size()==1) {
			return true;
		}
		return false;
		
	}
	
}
