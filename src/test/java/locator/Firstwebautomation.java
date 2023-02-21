package locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import ulitilities.DriverSetUp;

public class Firstwebautomation extends DriverSetUp{

	@Test(priority = 2,description = "Priority valuee is 2")

	public void testwebpageTitle() throws InterruptedException {
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
		assertEquals(driver.getTitle(), "Maven Repository: io.github.bonigarcia » webdrivermanager » 5.3.1");

		Thread.sleep(3000);
	}
	
	@Test(priority = 1, description = "Priority valuee is 1")

	public void testwebpageLicense() throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
		driver.manage().window().maximize();
		WebElement liense = driver.findElement(By.tagName("License"));
		System.out.println(liense.getText());
				

		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void testdescriptionByClassName() {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
		driver.manage().window().maximize();
		WebElement discription = driver.findElement(By.className("im-description"));
		assertEquals(discription.getText(),"Automated driver management and other helper features for Selenium WebDriver in Java");
		driver.quit();
	}
	
	@Test
	public void testNameByLinkText() {
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
	//	driver.manage().window().maximize();
		WebElement name = driver.findElement(By.linkText("WebDriverManager"));
		assertEquals(name.getText(),"WebDriverManager");
		System.out.println(name.getText());
		driver.quit();
	}
	
	@Test
	public void testNameByPartialLinkText() {
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
	//	driver.manage().window().maximize();
		WebElement name = driver.findElement(By.partialLinkText("WebDriverMana"));
		assertEquals(name.getText(),"WebDriverManager");
		System.out.println(name.getText());
		driver.quit();
	}
	
	@Test
	public void testSearchFieldById() throws InterruptedException {
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
	//	driver.manage().window().maximize();
		WebElement searchInput = driver.findElement(By.id("query"));
		searchInput.sendKeys("testng");
		WebElement search_button = driver.findElement(By.className("button"));
		search_button.click();
		Thread.sleep(2000);
		assertEquals(driver.getTitle(),"Maven Repostory: testng");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void testSearchFieldByName() throws InterruptedException {
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
	//	driver.manage().window().maximize();
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys("Hello");
		WebElement search_button = driver.findElement(By.className("button"));
		search_button.click();
		Thread.sleep(2000);
	    assertEquals(driver.getTitle(),"Just a moment...");
	
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
