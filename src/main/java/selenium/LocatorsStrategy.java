package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			//id
			//driver.findElement(By.id("input-email")).sendKeys("test");;
		
			//2.name can be duplicate
			//driver.findElement(By.name("firstname")).sendKeys("Nathiya");
			
		//By firstName =By.name("firstname");
		ElementUtils ele = new ElementUtils(driver);
		//ele.dosendKeys(firstName, "Nathiya");
		
		
		//3. classname its not unique attribute
		//driver.findElement(By.className("form-control")).sendKeys("test");
		//4.xpath CSSSelector
	//	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Nathiya");
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("testing");
		
//		By firstName =By.xpath("//*[@id=\"input-firstname\"]");
//		By lastName =By.xpath("//*[@id=\"input-lastname\"]");
//		ele.dosendKeys(firstName, "Nathiya");
//		ele.dosendKeys(lastName, "test");


		//5.CSS cascaded style sheet its not an attribute
		//driver.findElement(By.cssSelector("#input-firstname")).sendKeys("test");;
		//driver.findElement(By.cssSelector("#input-lastname")).sendKeys("automation");;

		//6.linkText
		//By loginLink = By.linkText("Login");
		//ele.doClick(loginLink);
		
		//7.partial link text 
		//driver.findElement(By.partialLinkText("Forgotton"));
		
		//8.tagName : not unique
		//String header =driver.findElement(By.tagName("h1")).getText();
		//System.out.println(header);
		
		By pageHeader = By.tagName("h1");
		String headerTxt =ele.dogetText(pageHeader);
		System.out.println(headerTxt);
		
			
	}

}
