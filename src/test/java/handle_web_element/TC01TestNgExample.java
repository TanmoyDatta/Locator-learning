package handle_web_element;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01TestNgExample {
	
	@Test(priority = 1,description = "1")
	public void test1() { 
		System.out.println("This is Test 1");
		
	}
	
	@Test(priority = 0,description = "2")
	public void test2() {
		System.out.println("This is Test 2");
		
	}@BeforeTest
	public void beforetest() {
		System.out.println("This is before Test");
		
	}@AfterTest
	public void aftertest() {
		System.out.println("This is after Test");
		
	}@BeforeClass
	public void beforclass() {
		System.out.println("This is before class");
		
	}@AfterClass
	public void afterclass() {
		System.out.println("This is after class");
		
	}
	@BeforeMethod
	public void beformethod() {
		System.out.println("This is before method");
		
	}@AfterMethod
	public void aftermethod() {
		System.out.println("This is after method");
		
	}
	@BeforeSuite
	public void beforsuite() {
		System.out.println("This is before suite");
		
	}@AfterSuite
	public void aftersuite() {
		System.out.println("This is after suite");
		
	}
	

}
