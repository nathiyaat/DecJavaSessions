package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class WebtableRelatvLctr {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();			
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		
		WebElement playrEle=driver.findElement(By.linkText("Joe.Root"));
		driver.findElement(with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(playrEle)).click();;

		
		List<WebElement> rightPlayrs = driver.findElements(with(By.xpath("//table[@id='resultTable']//td")).toRightOf(playrEle));	
		
		
		for(WebElement e:rightPlayrs) {
			System.out.println(e.getText());
		
		}
		
	}

}
