package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
//headless vs headed
		//no browser visibility
		
		//ChromeOptions cho= new ChromeOptions();
		//cho.addArguments("--headless");
		//cho.addArguments("--incognito");
		
		//WebDriver driver = new ChromeDriver(cho);
		//driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		
		//FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		
		EdgeOptions eo = new EdgeOptions();
		//eo.addArguments("--inprivate");
		eo.addArguments("--headless");

		WebDriver driver = new EdgeDriver(eo);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
