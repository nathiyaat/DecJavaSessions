package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkConcept {

	public static void main(String[] args) {
//total links
		//print text of each link
		//avoid blank text
		//broken link
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("all links "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++) {
			String text =allLinks.get(i).getText();
			
			if(text.length()!=0) {
			System.out.println(text);
			}
		}
		System.out.println("---------------------------------");
		for( WebElement e:allLinks) {
			String text = e.getText();
			
			if(text.length()!=0) {
				System.out.println(text);
			}
		}
		
		//total text fields on page
		List<WebElement>  allTxtField =driver.findElements(By.className("form-control"));
		System.out.println(allTxtField.size());
		
		
		
		
		
	}

}
