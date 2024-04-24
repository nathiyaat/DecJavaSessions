package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtil {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		By links = By.tagName("a");
		By imgs = By.tagName("img");
		//getElements(links);
		
//		System.out.println("total links "+getelemnetsCount(links));
//		System.out.println("total links "+getelemnetsCount(imgs));
//
//		ArrayList<String> eleLinks = getElemnetsListText(links);
//		System.out.println(eleLinks);
//		if(eleLinks.contains("Conditions")) {
//			System.out.println("PASS");
//		}
		
		ArrayList<String>  linksAttr = getElemsAttributeList(imgs, "src");
		System.out.println(linksAttr);
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getelemnetsCount(By locator) {
		return getElements(locator).size();
	}
	public static ArrayList<String> getElemnetsListText(By locator) {
		
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> listText = new ArrayList<String>();
		
		for(WebElement e: eleList) {
			String listTexts =e.getText();
			if(listTexts.length()!=0) {
				listText.add(listTexts);
			}
			
			
		}
		return listText;
	}
	
	public static ArrayList<String> getElemsAttributeList(By locator,String attrName) {
		
		List<WebElement> attrList =getElements(locator);
		ArrayList<String> AttrText = new ArrayList<String>();

		
		
		for(WebElement e : attrList) {
			String attrValue = e.getAttribute(attrName);
			if(attrValue.length()!=0) {
				AttrText.add(attrValue);
			}
		}
		return AttrText;
		
		
		
	}
	
	
	
}
