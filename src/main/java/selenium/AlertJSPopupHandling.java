package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopupHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Alert alert =driver.switchTo().alert();
//		String alrtText = alert.getText();
//		System.out.println(alrtText);
		
		//alert.accept();
		//alert.dismiss(); ///to cancel alert
		
		//confirmation alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		Alert alert =driver.switchTo().alert();
//		String alrtText = alert.getText();
//		System.out.println(alrtText);
//		alert.accept();

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert =driver.switchTo().alert();
		String alrtText = alert.getText();
		System.out.println(alrtText);
		
		alert.sendKeys("automation");
		//alert.accept();
		
	}

}
