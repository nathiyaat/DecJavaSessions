package selenium;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		String uname="admin";
		String pwd ="admin";
		
		
		//driver.get("https://"+uname+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");

		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//selnium 4.x
		
		((HasAuthentication)driver).register(() -> new UsernameAndPassword(uname, pwd));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}

}
