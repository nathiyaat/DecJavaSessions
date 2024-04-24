package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		List<WebElement> imgLinks = driver.findElements(By.tagName("img"));
		System.out.println("total links "+imgLinks.size());
		
		for(WebElement e :imgLinks) {
			String altValue =e.getAttribute("alt");
			String srcValue =e.getAttribute("src");

			System.out.println(altValue + "-------"+srcValue);
		}
		
		
	}

}
