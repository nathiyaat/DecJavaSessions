package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("56789");
		
		driver.switchTo().defaultContent();
		
		String vehicleText= driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(vehicleText);
		
	}

}
