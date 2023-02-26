package handle_web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ulitilities.DriverSetUp;

public class JsInAutomatation extends DriverSetUp{
	@Test
	public void ScrollUsingJs() throws InterruptedException {
		driver.get("https://www.w3schools.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo (0, document.body.scrollHeight);");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(2000);
		
		WebElement numpy = driver.findElement(By.xpath("//*[@id=\"main\"]/div[9]/div/div[25]/a/div/h2"));
		
		js.executeScript("arguments[0].scrollIntoView();" , numpy);
		Thread.sleep(2000);

	}

}
