package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSeq {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act = new Actions(driver);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		
		act.sendKeys(fname, "nathiya")
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys("test")
		.sendKeys(Keys.TAB)
		.pause(200)
		.build()
		.perform();

	}

}
