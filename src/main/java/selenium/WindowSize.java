package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().minimize();

		//driver.manage().window().maximize();
		//driver.manage().window().FullScreen();

		
		//Dimension dim = new Dimension(360, 740);
		//driver.manage().window().setSize(dim);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		WebElement fname=driver.findElement(By.id("input-firstname"));
		
		int height = fname.getSize().getHeight();
		int width = fname.getSize().getWidth();
		
		System.out.println(height);
		System.out.println(width);
		
		int x= fname.getLocation().getX();
		int y= fname.getLocation().getY();

		System.out.println(x);
		System.out.println(y);

		WebElement contBtn = driver.findElement(By.xpath("//input[@value='Continue']"));

		String bgColor = contBtn.getCssValue("background-color");
		
		
	}

}
