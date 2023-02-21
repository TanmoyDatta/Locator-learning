package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ulitilities.DriverSetUp;

public class DarazWebAutomateWithLocator extends DriverSetUp{
	
	@Test
	public void name() throws InterruptedException {
		driver.get("https://www.daraz.com.bd/#");
		WebElement signin = driver.findElement(By.xpath("//a[@data-spm-click='gostr=/lzdpub.header.tbar;locaid=d5']"));
		signin.click();
		Thread.sleep(2000);
		
		WebElement phoneNumberInput = driver.findElement(By.cssSelector("input[placeholder='Please enter your Phone Number or Email']"));
		phoneNumberInput.sendKeys("01777808463");
		Thread.sleep(2000);
		
		WebElement passwordInput = driver.findElement(By.cssSelector("input[placeholder='Please enter your password']"));
		passwordInput.sendKeys("pass1234");
		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.cssSelector("button[class='next-btn next-btn-primary next-btn-large']"));
		loginbutton.click();
		Thread.sleep(5000);
		
		WebElement searchprodudct = driver.findElement(By.cssSelector("input[type='search']"));
		searchprodudct.sendKeys("apple 13 pro max");
		WebElement button = driver.findElement(By.xpath("//button[@class='search-box__button--1oH7']"));
		button.click();
		Thread.sleep(2000);
		
		
		WebElement dropdown = driver.findElement(By.cssSelector("div[class='ant-select-selection__rendered']"));
		dropdown.click();
		Thread.sleep(2000);
		
		WebElement pricelowtoHigh = driver.findElement(By.cssSelector("div[data-spm-click='gostr=/lzdse.result.sort;locaid=d2']"));
		pricelowtoHigh.click();
		Thread.sleep(4000);
		
		WebElement appleSearch = driver.findElement(By.cssSelector("img[alt='iPhone 14 pro max 256 GB (HK) Active']"));
		appleSearch.click();
		Thread.sleep(2000);
		
		WebElement quantity = driver.findElement(By.cssSelector("i[class='next-icon next-icon-add next-icon-medium']"));
		quantity.click();
		Thread.sleep(2000);
		
		WebElement buy = driver.findElement(By.cssSelector("button[class='add-to-cart-buy-now-btn  pdp-button pdp-button_type_text pdp-button_theme_bluedaraz pdp-button_size_xl']"));
		buy.click();
		Thread.sleep(4000);
		
		WebElement placeOder = driver.findElement(By.xpath("//button[@class='next-btn next-btn-normal next-btn-medium place-order-btn']"));
		placeOder.click();
		Thread.sleep(8000);
		
		
//		WebElement bkash = driver.findElement(By.cssSelector("img[src='https://laz-img-cdn.alicdn.com/tfs/TB14FT1JpOWBuNjy0FiXXXFxVXa-400-400.png']"));
//		bkash.click();
//		Thread.sleep(8000);
	}
	@Test(description="this is")
	
	public void name1() throws InterruptedException {
		driver.get("https://www.daraz.com.bd/catalog/?q=apple+13+pro+max&_keyori=ss&from=input&spm=a2a0e.searchlist.search.go.5dd84f7avD07Au");
		WebElement pricelowtoHigh = driver.findElement(By.cssSelector("li[class='ant-select-dropdown-menu-item-selected ant-select-dropdown-menu-item']"));
		pricelowtoHigh.click();
		Thread.sleep(4000);
	
}
//	@Test
//		
//		public void name1() throws InterruptedException {
//		// phone selection (search = apple 13 pro max)
//		driver.get("https://www.daraz.com.bd/catalog/?spm=a2a0e.home.search.1.297612f78NbkiX&q=apple%2013%20pro%20max&_keyori=ss&from=search_history&sugg=apple%2013%20pro%20max_0_1");
//		//WebElement phone = driver.findElement(By.xpath("//a[@data-spm-anchor-id=\"a2a0e.searchlist.list.2\"]"));
//		WebElement phone = driver.findElement(By.cssSelector("img[class='image--WOyuZ']"));
//		phone.click();
//		Thread.sleep(4000);
//		
//		
//	}
}

