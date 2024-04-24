package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");			
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.switchTo().frame("pact1");//f1
		driver.findElement(By.id("inp_val")).sendKeys("testing");		
		//switch to 2nd frame
		driver.switchTo().frame("pact2");		//f2
		driver.findElement(By.id("jex")).sendKeys("Auto");
		
		//switch to 3rd frame
				driver.switchTo().frame("pact3");	//f3	
				driver.findElement(By.id("glaf")).sendKeys("Selenium");
				
				//driver.switchTo().defaultContent();				
				//String header_txt = driver.findElement(By.tagName("h3")).getText();
				//System.out.println("headrr text is ***************" +header_txt);
				
				driver.switchTo().parentFrame(); // go back to prev frame //f2
				driver.findElement(By.id("jex")).sendKeys("Auto with Fun **********");
				
				driver.switchTo().parentFrame(); // go back to prev frame //f1
				driver.findElement(By.id("inp_val")).sendKeys("testing f1 **********");
				
				driver.switchTo().parentFrame(); // go to main page
				String header_txt = driver.findElement(By.tagName("h3")).getText();
				System.out.println("headrr text is ***************" +header_txt);


	}

}
