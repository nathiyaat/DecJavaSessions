package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDwn {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		
//		driver.findElement(By.id("justAnInputBox")).click();
//		Thread.sleep(2000);
//
//		List <WebElement> choiceList =driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		System.out.println(choiceList.size());
//		
//		for(WebElement e:choiceList) {
//			String text = e.getText();
//			
//			if(text.contains("choice 1")) {
//				e.click();
//				break;
//			}
//		}
		
		
		By drpClick =By.id("justAnInputBox");
		By comboList = By.xpath("//span[@class='comboTreeItemTitle']");
		
		//1. single selection
		selectChoice(drpClick,comboList,"choice 1");
		
		//2.multi selection
		//selectChoice(drpClick,comboList,"choice 1","choice 3","choice 6","choice 7");

		//3. all selection 
		//selectChoice(drpClick,comboList,"all");

		selectChoice(drpClick, comboList, "choice 1");
		
	}
	
	/**
	 * This method allows single,multiple, all selections
	 * @param locator
	 * @param comboChoince
	 * @param value
	 * @throws InterruptedException
	 */
	
	public static void selectChoice(By locator,By comboChoince,String... value) throws InterruptedException {
		
		driver.findElement(locator).click();
		Thread.sleep(2000);

		List <WebElement> choiceList =driver.findElements(comboChoince);
		
		if(!value[0].equals("all")) {
		System.out.println(choiceList.size());
		
		for(WebElement e:choiceList) {
			String text = e.getText();
			
			for(String val: value) {
				if(text.equals(val)) {
					e.click();
				}
			}
			
		}
		}
		else {
			for(WebElement e:choiceList) {
				try {
				e.click();
				}
				catch(ElementNotInteractableException ex) {
					break;
				}
			}
		}
		
	}

}
