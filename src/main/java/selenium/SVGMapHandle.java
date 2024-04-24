package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGMapHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();			
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgXpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g']";
		//svg#map-svg g#regions g.region
		
		List<WebElement> stateList = driver.findElements(By.xpath(svgXpath));
		System.out.println("state list size is ************"+stateList.size());

		Actions act = new Actions(driver);
		
	for(WebElement e :stateList) {
		
		act.moveToElement(e).perform();
		String stateid=e.getAttribute("id");
		System.out.println(stateid);
		Thread.sleep(5000);

	}
	

}
	
}
