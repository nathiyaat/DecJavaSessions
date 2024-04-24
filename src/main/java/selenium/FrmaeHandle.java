package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrmaeHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
			
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame(2);
		String title = driver.findElement(By.tagName("h2")).getText();
		System.out.println(title);
		
		driver.switchTo().defaultContent();
		
		
	}

}
