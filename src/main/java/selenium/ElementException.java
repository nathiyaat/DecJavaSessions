package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart");
		//driver.findElement(By.name("search11")).sendKeys("yyy");
		//NoSuchElementException
		
		List<WebElement> elsTag =driver.findElements(By.tagName("naveen"));
		System.out.println(elsTag); //[]
		System.out.println(elsTag.size()); //0
		
		
		
		
		
	}

}
