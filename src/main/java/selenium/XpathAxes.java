package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathAxes {

	static WebDriver driver;
	public static void main(String[] args) {

		//parent to direct child /
		//form/div/input
		
		//parent to direct + indirect child //
		//select[@id='']//option  --->collects both direct and indirect
		
		
		//child to parent
		//input[@id='email']/../..
		//input[@id='email']/parent::div/parent::form
		
		//child to grand parent
		//input[@id='email']/ancestor::form
		//input[@id='email']/ancestor::form/ancestor::body/ancestor::html
		
		//following-sibling::input
		//preceding-sibling::a
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//String xpath="//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']";
		
		//driver.findElement(By.xpath(xpath)).click();
		
		selectUser("Joe.Root");
		selectUser("Garry.White");
		System.out.println(getUserdetails("John.Smith"));
		System.out.println(getUserdetails("Joe.Root"));

		
		////a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		////a[text()='Jordan']/ancestor::tr//input[@type='checkbox']
		
		
	}
	
	public static void selectUser(String user) {
		
		String xpath="//a[text()='"+user+"']/ancestor::tr//input[@type='checkbox']";
		
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static List<String> getUserdetails(String usrName) {
		String xpath="//a[text()='Joe.Root']/parent::td/following-sibling::td";
		List<WebElement> userInfo =driver.findElements(By.xpath(xpath));
		
		List<String> userList = new ArrayList<String>();
		
		for(WebElement e : userInfo) {
			String text = e.getText();
			
			userList.add(text);
		}
		return userList;
	}

}
