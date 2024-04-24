package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;
	
		public static void main(String[] args) {
			driver= new ChromeDriver();

			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			driver.findElement(By.id("input-email")).sendKeys("nathiya@gmail.com");
			String email =driver.findElement(By.id("input-email")).getAttribute("value");
			System.out.println(email);
			
			
			By firtstname =By.id("input-firstname");
			By lastname =By.id("input-lastname");
			By email1 =By.id("input-email");
			By tele =By.id("input-telephone");
			By passwd =By.id("input-password");
			By confPwd =By.id("input-confirm");
			
			
			ElementUtils eleUtil = new ElementUtils(driver);
			eleUtil.dosendKeys(firtstname, "nathiya");
			eleUtil.dosendKeys(lastname, "automation");
			eleUtil.dosendKeys(email1, StringUtils.getRandomEmail());
			eleUtil.dosendKeys(tele, "897898789");
			eleUtil.dosendKeys(passwd, "test@123");
			eleUtil.dosendKeys(confPwd, "test@123");
			
			String fname =driver.findElement(By.id("input-firstname")).getAttribute("value");
			System.out.println(fname);
	}

}
