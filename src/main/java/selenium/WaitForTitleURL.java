package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.linkText("Sign Up")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.titleContains("Free CRM software for customer relationship"));		
//		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.urlContains("/register"));
		
		System.out.println(driver.getCurrentUrl());
		
		//String titleContent =waitForTitleContains("Free CRM software for customer relationship", 5);
	//	System.out.println(titleContent);		
		
	}
	
	public static String waitForTitleContains(String titleFraction,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		try {
		if(wait.until(ExpectedConditions.titleContains(titleFraction))){
			return driver.getTitle();
		}
		}
		catch(Exception e) {
			System.out.println("title is not found within : "+timeout);
		}
		return null;
		
	}
	public static String waitForTitleIs(String title,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		try {
		if(wait.until(ExpectedConditions.titleIs(title))){
			return driver.getTitle();
		}
		}
		catch(Exception e) {
			System.out.println("title is not found within : "+timeout);
		}
		return null;
		
	}
	
	public static String waitForURLContains(String urlFraction,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		try {
		if(wait.until(ExpectedConditions.urlContains(urlFraction))){
			return driver.getCurrentUrl();
		}
		}
		catch(Exception e) {
			System.out.println("URL fraction is not found within : "+timeout);
		}
		return null;
		
	}
	public static String waitForURLIs(String urlFull,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		try {
		if(wait.until(ExpectedConditions.urlToBe(urlFull))){
			return driver.getCurrentUrl();
		}
		}
		catch(Exception e) {
			System.out.println("URL is not found within : "+timeout);
		}
		return null;
		
	}

	

}
