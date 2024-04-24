package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	
	  public static void main(String args[]) {
		  
		  //top casting
		 // WebDriver driver = new ChromeDriver();
		  
		  WebDriver driver = new EdgeDriver();

		  
		  driver .get("https://www.google.com");
		 String pageTitle = driver.getTitle();
		 System.out.println("page title: "+pageTitle); 
		 
		 //verfication point actual vs expected
		 if(pageTitle.equals("Google")) {
			 System.out.println("correct title PASS");
		 }else {
			 System.out.println("correct title FAIL");

		 }
		
		 String url = driver.getCurrentUrl();
		 System.out.println("URL is "+url);
		 if(url.contains("google.com")) {
			 System.out.println("URL PASS");

		 }
		 else {
			 System.out.println("url FAIL");
		 }
		 
		 
	  }
}
