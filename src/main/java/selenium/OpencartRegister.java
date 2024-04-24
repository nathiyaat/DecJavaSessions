package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartRegister {

	static WebDriver driver;
	public static void main(String[] args) {

		BrowserUtil brw = new BrowserUtil();

		WebDriver driver = brw.launchBrowser("chrome");

		brw.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String title = brw.getPageTitle();
		System.out.println(title);
		
		ElementUtils ele = new ElementUtils(driver);
		By register =By.xpath("//div[@class='list-group']/a[text()='Register']");
		ele.eleClick(register);
		
		String regTitle = brw.getPageTitle();
		System.out.println(regTitle);
		
		By firtstname =By.id("//input[@id='input-firstname']");
		By lastname =By.id("//input[@id='input-input-lastname']");
		By email =By.id("//input[@id='input-email']");
		By tele =By.id("//input[@id='input-telephone']");
		By passwd =By.id("//input[@id='input-password']");
		By confPwd =By.id("//input[@id='input-confirm']");

		ele.dosendKeys(firtstname, "Nathiya");
		ele.dosendKeys(lastname, "balaraman");
		ele.dosendKeys(email, "Nathiya@gmail.com");

		ele.dosendKeys(tele, "9878976567");
		ele.dosendKeys(passwd, "test@123");
		ele.dosendKeys(confPwd, "test@123");


	}

}
