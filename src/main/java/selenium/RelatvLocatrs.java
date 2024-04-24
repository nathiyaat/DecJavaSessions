package selenium;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RelatvLocatrs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email=driver.findElement(By.id("input-email"));
		
		String label_email = driver.findElement(with(By.cssSelector("label[for='input-email']")).above(email)).getText();
		System.out.println(label_email);
		
		
		WebElement h2header=driver.findElement(By.xpath("//h2[text()='New Customer']"));
		WebElement ContBtn=driver.findElement(By.xpath("//a[text()='Continue']"));


		List<WebElement> pList = driver.findElements(with(By.tagName("p")).below(h2header).above(ContBtn));
		
		for(WebElement e: pList) {
			System.err.println(e.getText());
		}
		
		
		
		
		
		
	}

}
