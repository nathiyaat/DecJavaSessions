package selenium;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {

		//using any attr
		//tagName[@attrName='value']  //input[@id='email']
		
		//2. using single attr using and or
		//using multiple attr
		
		//3.text()
		//a[text()='Login']
		
		//4. text() and sttributes
		//a[@class=''drpdown' and text()='Login']
		//a[text()='' and @calss='' and @dat-toggle='']
		
		//5. contains() with attribute
		//input[contains(@place-holder,'Address')]
		//tagnems[contains(@class,'') and @name='email' and contains(@id,'input')]
		//6.contains() with text
		//a[contains(text(),'Customer')]
		
		//7.contains() with text and attr
		//a[contains(text(),'') and contains(@id,'notebook')]
		//a[contains(text(),'') and contains(@id,'notebook') and contains(@class,'notebook')]
		
		//8.starts-with()
		//input[starts-with(@placeholder,'Address')]
		
		//9.starts-with() with text
		//a[starts-with(text(),'Forgotten')]
		
		//dynamic ids
		//input<id='123_login_firstname'>
		//11. index based xpath
		//(//a[text()='Fogrgotten password'])
		//(//input[@class='form-control'])[7]
		
		By fgt_pwd=By.xpath("//a[text()='']");
		
		
		
		
		
		
		
		
		
		
	}

}
