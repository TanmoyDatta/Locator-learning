package handle_web_element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ulitilities.DriverSetUp;

public class TC06_Test_Allert extends DriverSetUp{

	@Test
	public void TestAllert() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert3.getText());
		alert3.sendKeys("Tanmoy Datta");
		alert3.accept();
		Thread.sleep(5000);
		
		
	}
}
