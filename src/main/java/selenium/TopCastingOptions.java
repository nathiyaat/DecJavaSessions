package selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1. Wd dr = new ChromeDriver()
		
		//run tests on local machines
		//WebDriver driver = new ChromeDriver();
		
		//SearchContext driver =new ChromeDriver(); no methods for get
		//driver.get()
		
		//valid recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//
		//ChromiumDriver driver = new ChromeDriver(); //supports oly chrome and edge browser not others safari
		//ChromeDriver driver = new FirefoxDriver();
		
		//run tests on remote/cloud/server/aws/grid
		//WebDriver driver = new RemoteWebDriver(severURL,capabilities);
		
		//works oly for chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		
		
		
		
		
	}

}
