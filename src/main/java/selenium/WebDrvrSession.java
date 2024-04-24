package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDrvrSession {

	public static void main(String[] args) {
		 WebDriver driver = new EdgeDriver();

		  
		  driver .get("https://www.google.com");
		 String pageTitle = driver.getTitle();
		 System.out.println("page title: "+pageTitle); 
		 
		 //verfication point actual vs expected
				
		 String url = driver.getCurrentUrl();
		 System.out.println("url title: "+url); 

	}

}
