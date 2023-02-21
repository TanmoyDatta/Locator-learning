package handle_web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ulitilities.DriverSetUp;

public class TC03iFrameCheckBoxRadioButton extends DriverSetUp{
	
	@Test
	
	public void radioButton() throws InterruptedException {
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.switchTo().frame(0);
		
		WebElement radioButton1 = driver.findElement(By.cssSelector("label[for='radio-1']"));
		radioButton1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement tagName = driver.findElement(By.cssSelector("h1[class='entry-title']"));
		System.out.println(tagName.getText());
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement radioButton2 = driver.findElement(By.cssSelector("label[for='radio-2']"));
		radioButton2.click();
		Thread.sleep(2000);
		
		WebElement checkboxButton5 = driver.findElement(By.cssSelector("label[for='checkbox-4']"));
		checkboxButton5.click();
		WebElement checkboxButton3 = driver.findElement(By.cssSelector("label[for='checkbox-2']"));
		checkboxButton3.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		
	}

}
