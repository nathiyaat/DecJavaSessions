package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		
		//id
		//input#username
		//#username
		
		//class
		//.class
		//tagname.class
		//input.login-email
		
		//class+id
		//.class#id
		//input.form-control#username
		
		//c1.c2.c3.c4..... n
		
		//css attributes
		//tabname[class='']
		//input[id='email'][type='text']
		
		
		//cssSelector with contains
		//input[placeholder*='Email']
		
		//parent to child
		//form#hs-login > div
		
		//select#form-country > option (direct)
		//select#form-country option (direct +indirect)
		
		//all childs
		//option[value='algeria'] + option //immediate following sibling
		//option[value='algeria'] ~ option  //all following sibling
		
		int size =driver.findElements(By.cssSelector("input#email,input#pwd,btn#btnLogin")).size();
		
		if(size == 4) {
			System.out.println("all mandatory fields r present on page");
		}
		
		
		//not in css
		//div.form-group >input#email:not(#input-pwd)
		
		driver.findElement(By.cssSelector("input[class='form-control private-form__control login-email']")).sendKeys("testing");
		
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("demo");
		
		
	}

}
