package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightEle {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();

      //  EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        //driver.register(new HighLighterEventListener());
        
        By email=By.name("email");
        
        WebElement ele= driver.findElement(email);
        
        String orignlStyle=ele.getAttribute("style");
        		

        JavascriptExecutor js = (JavascriptExecutor) driver; 
        js.executeScript("arguments[0].style.border='3px solid red'", ele);
        
        

        //Do something e.g. make a screenshot

        //Reset style
       // js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", ele, "style", orignlStyle);
    
		
		
	}

}
