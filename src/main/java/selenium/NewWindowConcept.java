package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String pwd = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(pwd);
		System.out.println(driver.getTitle());

		
	}

}
