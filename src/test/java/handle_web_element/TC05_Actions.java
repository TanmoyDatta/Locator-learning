package handle_web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ulitilities.DriverSetUp;

public class TC05_Actions extends DriverSetUp{
	
	@Test
	public void TestDifferntAction() throws InterruptedException {
		
		driver.get("https://demoqa.com/menu");
		
		Actions actions = new Actions(driver);
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		// hobber
		actions.clickAndHold(menu).build().perform();
		Thread.sleep(2000);
		actions.clickAndHold(driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 2')]")).click();
		Thread.sleep(2000);
		// scroll
		WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'Select Menu')]"));
		//actions.moveToElement(scroll).build().perform();
		actions.scrollToElement(scroll).build().perform();
		Thread.sleep(2000);
		actions.click();
		Thread.sleep(5000);
	}
	
	//multiple select used to control key press
	@Test
	public void TestMultipleSelectUsingActions() throws InterruptedException {
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Actions actions = new Actions(driver);
		
		driver.switchTo().frame("iframeResult");
		
		// multiple select use Select class
		Select select = new Select(driver.findElement(By.id("cars")));
		// control kyes press
		actions.keyDown(Keys.CONTROL).click(select.getOptions().get(0)).click(select.getOptions().get(2)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);	
	}

}
