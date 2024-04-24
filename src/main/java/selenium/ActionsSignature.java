package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSignature {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://signature-generator.com/draw-signature/");
		Actions act = new Actions(driver);
		WebElement canvas = driver.findElement(By.xpath("//canvas[@id='signature-pad']"));

		Action signature = act.click(canvas)
				.moveToElement(canvas, 40, 25)
				.clickAndHold(canvas)
				.moveToElement(canvas, -50, -10)
				.moveByOffset(-200, -100)
				.release(canvas)
				.build();
		
		signature.perform();
		
	}

}
