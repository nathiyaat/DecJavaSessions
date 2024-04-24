package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorconcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/");
		
		//driver.get("https://classic.freecrm.com/");
		//driver.get("https://classic.crmpro.com/");
		
		driver.get("https://app.hubspot.com/login");
		JavascriptExecutor js = (JavascriptExecutor)driver;

		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println("title ***********"+title);
//		
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println("URL ***********"+url);
		
		JavaScriptUtil jsu=new JavaScriptUtil(driver,js);
		String jsTitle = jsu.getTitlebyJS();
		System.out.println(jsTitle);
		
		
		//jsu.generateAlert("this is nathiya");
		//jsu.generateConfirmPopup("this is confirmation popup");
		
		//String pageText = jsu.getPageInnerText();
		//System.out.println(pageText);
		
		
		//WebElement dealsText = driver.findElement(By.xpath("//h3[text()='Deals & Sales Pipeline']"));		
		WebElement form_id = driver.findElement(By.id("hs-login"));		

		
		//jsu.scrollIntoView(dealsText);
		
		//jsu.zoomChromeEdge("200");
		
		//jsu.drawBorder(dealsText);
		//jsu.drawBorder(form_id);
		jsu.flash(form_id);

		
		WebElement loginBtn= driver.findElement(By.id("loginBtn"));
		jsu.cliclEleByJS(loginBtn);
		
//		JavaScriptUtil jsu=new JavaScriptUtil(driver);
//		String jsTitle = jsu.getTitlebyJS();
//		System.out.println(jsTitle);
		
	}

}
