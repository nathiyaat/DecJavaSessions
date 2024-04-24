package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int tr_count =driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("tr count ******" +(tr_count-1));
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
//		String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
//		String afterXpath="]/td[1]";
//		
//		for(int row=2;row<=tr_count;row++) {
//			String xpath = beforeXpath+row+afterXpath;
//			System.out.println(xpath);
//			String text =driver.findElement(By.xpath(xpath)).getText();
//			System.out.println(text);
//		}
		
		List<WebElement> tableData = driver.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr/td"));
		
		for(WebElement e : tableData) {
			System.out.println(e.getText());
		}
		
	}

}
