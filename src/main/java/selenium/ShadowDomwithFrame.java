package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomwithFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(16000);
//		String search_script ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//
//		WebElement search =(WebElement)js.executeScript(search_script);
//		search.sendKeys("Notifications");
		
		//sc2. Browser ---shadow DOM(open) iframe-- element
		
		
		String ifrmae_script ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Frmae_ele =(WebElement)js.executeScript(ifrmae_script);
		
		driver.switchTo().frame(Frmae_ele);
		
		driver.findElement(By.id("glaf")).sendKeys("PASS");
		
	}

}
