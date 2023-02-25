package handle_web_element;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ulitilities.DriverSetUp;

public class TC04SelectTagDropDown extends DriverSetUp{
	
	@Test
	public void slectTag() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectOptin = driver.findElement(By.id("dropdown-class-example"));
		
		
		selectOptin.click();
		Select select = new Select(selectOptin);
		
		
        select.selectByIndex(2);
        System.out.println(select.getOptions().get(3).getText());	
		assertEquals(select.getFirstSelectedOption().getText(),"Option2");
		Thread.sleep(2000);
		
		select.selectByIndex(2);
//		
//		SoftAssert softAssert =new SoftAssert();
//		
//		
//		softAssert.assertEquals(select.getFirstSelectedOption().getText(),"Option2");
//		Thread.sleep(2000);
//		
//		System.out.println(select.getOptions().size());
//		System.out.println(select.getOptions().get(3).getText());		
//		
//		select.selectByValue("option1");
//		softAssert.assertEquals(select.getFirstSelectedOption().getText(),"Option1");
//		Thread.sleep(2000);
//		
//		select.selectByVisibleText("Option3");
//		softAssert.assertEquals(select.getFirstSelectedOption().getText(),"Option2");
//		softAssert.assertAll();
//		Thread.sleep(2000);
		
	}

}
