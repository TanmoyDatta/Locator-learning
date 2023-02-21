package handle_web_element;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import ulitilities.DriverSetUp;

public class TC02Get_Nevigate extends DriverSetUp{
	
	public String base_url="https://rahulshettyacademy.com/AutomationPractice/";
	
	@Test
	public void navigateToWebPage() throws InterruptedException {
		
		driver.get(base_url); // ekhne load kore sompurno page load hobe
		driver.navigate().to("https://www.rahulshettyacademy.com/"); // navigate load kore chere dibe, puro page load hower jonno opekkha korbe na
	    driver.navigate().back();
	    driver.navigate().refresh();
	    driver.navigate().forward();
		Thread.sleep(3000);
	}
	@Test
	public void handleBrowserWindow() throws InterruptedException {
		driver.get(base_url);
//		driver.switchTo().newWindow(WindowType.TAB); ; // new Tab a open hobe
//		Thread.sleep(1000);
//		driver.navigate().to("https://www.rahulshettyacademy.com/");
//		Thread.sleep(2000);
//		
//		driver.switchTo().newWindow(WindowType.WINDOW); // new window te open hobe
//		driver.get(base_url);
//		Thread.sleep(2000);
//		driver.close();
		driver.findElement(By.id("openwindow")).click();
		driver.findElement(By.id("opentab")).click();
		System.out.println(driver.getTitle());
	//	System.out.println(driver.getWindowHandle()); // proti ta tab er jonno akta unic string ID thake, gethandle diye sudu akta return kore [page er string ID] dekha jai
		//System.out.println(driver.getWindowHandles()); //gethandles diye je koita tab/page open korbo proti ta page er string ID return korbe
	
		List<String> windowhandlelist = new ArrayList<String>(driver.getWindowHandles()); // arraylist er get diye [page er string ID] ber kora 
		System.out.println(windowhandlelist.get(0));
		System.out.println(windowhandlelist.get(1));
		System.out.println(windowhandlelist.get(2));
		
		driver.switchTo().window(windowhandlelist.get(1)); // onno tab er Title pawya jai evabe
		System.out.println(driver.getTitle());
		
	}

}
