package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchOptions {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();

		driver.get("https:www.google.com");
		
		By search = By.name("q");
		
		By searchSugg = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span");
		doSearch(search,searchSugg,"selenium","ace");
		
		
		
	}
	
	public static void doSearch(By searchText,By suggestion,String searchKey,String searchVal) throws InterruptedException {
driver.findElement(searchText).sendKeys(searchKey);
		
		Thread.sleep(3000);
		List<WebElement> search_list =driver.findElements(suggestion);
		System.out.println(search_list.size());
		
		for(WebElement e: search_list) {
			
			String text =e.getText();
			System.out.println(text);
			if(text.contains(searchVal)) {
				e.click();
				break;
			}
			
			
		}
	}

}
