package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		
		//String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
		//String fn_name = driver.findElement(By.id("input-firstname")).getAttribute("name");
		//String fn_type = driver.findElement(By.id("input-firstname")).getAttribute("type");


		//System.out.println(fn_placeholder);
		//System.out.println(fn_name);
		//System.out.println(fn_type);
By registerLink = By.linkText("Register");

		
		By firstName = By.id("input-firstname");
		String fn_type = doeleGetAttribut(firstName, "type");
		System.out.println(fn_type);
		
		//By registerLink = By.linkText("Register");
		
		String register_href = doeleGetAttribut(registerLink, "href");
		System.out.println(register_href);
		
		
		String register_class = doeleGetAttribut(firstName, "class");
		System.out.println(register_class);
		


		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static String doeleGetAttribut(By locator ,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	

}
