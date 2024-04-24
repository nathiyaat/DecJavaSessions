package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultiple {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();

		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement drpdownEle =driver.findElement(By.xpath("//select[@multiple]"));
		Select multiDrp = new Select(drpdownEle);
		
		System.out.println(multiDrp.isMultiple());
		
		if(multiDrp.isMultiple()) {
			System.out.println("multi select is possible");
			
			multiDrp.selectByVisibleText("American flamingo");
			multiDrp.selectByVisibleText("Chilean flamingo");	
			multiDrp.selectByVisibleText("Lesser flamingo");		

			
		}
		multiDrp.deselectByVisibleText("Lesser flamingo");
		//multiDrp.deselectAll();
		
		
		
		
	}

}
