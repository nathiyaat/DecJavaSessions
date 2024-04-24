package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().timeouts().getPageLoadTimeout().getSeconds(); //returns long
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
