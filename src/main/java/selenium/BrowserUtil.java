package selenium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


/**
 * 
 * @author Satish
 *
 */

public class BrowserUtil {

		WebDriver driver;
/**
 * this method used to init browser based on given browser name
 * @param brwsrName
 * @return this returns driver
 */
		
		public WebDriver launchBrowser(String brwsrName) {
			System.out.println("Browser name is "+brwsrName);		
			switch (brwsrName.toLowerCase().trim()) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;

			case "edge":
				driver=new EdgeDriver();
				break;
			case "safari":
				driver = new SafariDriver();

			default:
				System.out.println("plz pass right browser");
				throw new BrowserException("BROWSER NOT FOUND");
			}
			return driver;
			
		}

	public void launchURL(String url) {
		if(url== null) {
			throw new BrowserException("URL IS NULL");
			
		}
		if(url.indexOf("http")== 0) {
			driver.get(url);
		}
		else {
			throw new BrowserException("HTTPMISSING IN URL");
		}
		
	}
	
	public void launchURL(URL url) {
		if(url== null) {
			throw new BrowserException("URL IS NULL");
			
		}
		String appURL = String.valueOf(url);
		
		if(appURL.indexOf("http")== 0) {
			driver.navigate().to(url);
		}
		else {
			throw new BrowserException("HTTPMISSING IN URL");
		}
		
	}
	
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

	
	
}
