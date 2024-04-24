package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeyswithPause {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act = new Actions(driver);

		WebElement searchBar=driver.findElement(By.name("search"));
		String value="macbook";
		
		char[] val = value.toCharArray();
		for(char c: val) {
			act.sendKeys(searchBar, String.valueOf(c)).pause(500).build().perform();;
		}
		
		
	}

}
