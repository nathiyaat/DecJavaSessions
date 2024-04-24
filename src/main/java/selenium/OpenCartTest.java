package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
BrowserUtil brw = new BrowserUtil();

WebDriver driver = brw.launchBrowser("chrome");

brw.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

String title = brw.getPageTitle();
System.out.println(title);


By username = By.id("input-email");
By pwd = By.id("input-password");

ElementUtils ele = new ElementUtils(driver);
ele.dosendKeys(username, "test@gmail.com");
ele.dosendKeys(pwd, "test@123");






	}

}
