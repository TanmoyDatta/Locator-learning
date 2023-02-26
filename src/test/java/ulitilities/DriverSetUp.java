package ulitilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
	public WebDriver driver;
	
	@BeforeSuite
	public void setDriver() {
		driver = new ChromeDriver();
		//driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
}