package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();			
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("macbook");
		driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();
		
	}

}
