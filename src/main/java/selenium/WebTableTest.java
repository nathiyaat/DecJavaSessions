package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver= new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
driver.findElement(By.name("username")).sendKeys("apiautomation");
driver.findElement(By.name("password")).sendKeys("Selenium@12345");
driver.findElement(By.xpath("//input[@value='Login']")).click();

Thread.sleep(4000);
driver.switchTo().frame("mainpanel");


driver.findElement(By.linkText("CONTACTS")).click();


	}
	
	public static void selectContact(String uname) {
		String xpath="//a[text()='"+uname+"']/parent::td/preceding-sibling::td/child::input";
		
		driver.findElement(By.xpath(xpath)).click();	
	}
	public static void getCompany(String uname) {
		String xpath="//a[text()='"+uname+"']/parent::td/preceding-sibling::td/child::input";
		
		driver.findElement(By.xpath(xpath)).click();	
	}
	
	

}
