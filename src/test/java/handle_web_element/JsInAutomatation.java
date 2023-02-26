package handle_web_element;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		
		WebElement asp = driver.findElement(By.xpath("//*[@id=\"main\"]/div[9]/div/div[25]/a/div/h2"));
		
		js.executeScript("arguments[0].scrollIntoView();" , asp);
		asp.click();
		
		Thread.sleep(2000);

	}
	@Test
	public void testWait() {
		driver.get("https://qavbox.github.io/demo/alerts/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='delayalert']")));
		btn.click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		assertEquals(alert.getText(), "I appeared after 5 seconds!");
		alert.accept();
		
		
	}

}
