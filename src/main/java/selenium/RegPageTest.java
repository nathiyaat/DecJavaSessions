package selenium;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegPageTest {

	static WebDriver driver;
	
	
	
	public static void main(String[] args) {

		//driver=new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		BrowserUtil brUtil = new BrowserUtil();
		driver =brUtil.launchBrowser("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firtstname =By.id("input-firstname");
		By lastname =By.id("input-lastname");
		By email =By.id("input-email");
		By tele =By.id("input-telephone");
		By passwd =By.id("input-password");
		By confPwd =By.id("input-confirm");
		
		By subscribeYes= By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By subscribeNo= By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]");


		By policyChkbox=By.name("agree");
		//By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
		By successMsg =By.tagName("h1");
		
		ElementUtils eleUtil = new ElementUtils(driver);
		//eleUtil.dosendKeys(firtstname, "nathiya");
		
		StringBuilder nsb =new StringBuilder("abc");
		String s="testing";
		
		//CharSequence interface has 3 child classes String StringBuilder,StringBuffer
		
		driver.findElement(By.id("input-firstname")).sendKeys(nsb,s,"nathiya");
		
		eleUtil.dosendKeys(lastname, "automation");
		eleUtil.dosendKeys(email, StringUtils.getRandomEmail());
		eleUtil.dosendKeys(tele, "897898789");
		eleUtil.dosendKeys(passwd, "test@123");
		eleUtil.dosendKeys(confPwd, "test@123");
		
		eleUtil.doClick(subscribeNo);
		eleUtil.doClick(policyChkbox);
		//eleUtil.doClick(continueBtn);

		String actSucMsg =eleUtil.dogetText(successMsg);
		System.out.println(actSucMsg);
		if(actSucMsg.contains("Your Account Has Been Created")) {
			System.out.println("user Reg PASSED");
		}else {
			System.out.println("user Reg FAILED");

		}
		
		
		
		
		
	}

}
