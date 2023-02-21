package locator;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ulitilities.DriverSetUp;

public class Locator_learning_Advance extends DriverSetUp{
	
	@Test
	public void locateRadioButtonBycssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_button_one = driver.findElement(By.cssSelector("input[value='radio1']"));
		radio_button_one.click();
		assertEquals(driver.getTitle(),"Practice Page");
		Thread.sleep(3000);	
	}
	@Test
	public void locateRadioallButtonBycssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_button_two = driver.findElement(By.cssSelector("input[type='checkbox']"));
		radio_button_two.click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
	@Test
	public void Elements() throws InterruptedException {
		driver.get("https://www.techwithtim.net/");
		List<WebElement> elements= driver.findElements(By.xpath("//* [@type]"));
		System.out.println("Number of elements: " +elements.size());
		
		for(int i=0; i<elements.size(); i++) {
			System.out.println("Names: " +elements.get(i).getAttribute("value"));
		}
		
		Thread.sleep(2000);
	}
	
	@Test
	public void locateRadioButtonByXpath() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio_button_two = driver.findElement(By.xpath("//input[@value='radio2']"));
		radio_button_two.click();
		Thread.sleep(2000);
	}
	@Test
	public void locateHeaderBycssSelectorTAgNamecssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement header_h1 = driver.findElement(By.cssSelector("h1"));
		System.out.println(header_h1.getText());
		Thread.sleep(2000);
	}
	@Test
	public void locateHeaderByXpathTagNameXpath() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement header_h1 = driver.findElement(By.xpath("//h1"));
		System.out.println(header_h1.getText());
		Thread.sleep(2000);
	}
	@Test
	public void locateRadioButtonBycssSelectorDirectChildcssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobuttonExample = driver.findElement(By.cssSelector("fieldset > legend"));
		System.out.println(radiobuttonExample.getText());
		Thread.sleep(2000);
	}
	@Test
	public void locatRadioButtonByXpathDirectChildXpath() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobuttonExample = driver.findElement(By.xpath("//fieldset/legend"));
		System.out.println(radiobuttonExample.getText());
		Thread.sleep(2000);
	}
	@Test
	public void selectOption2BycssSelectorDirectChildcssSelector() throws InterruptedException { // 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectOption2 = driver.findElement(By.cssSelector("select > option[value='option2']"));
		selectOption2.click();
		Thread.sleep(2000);
	}
	@Test
	public void selectOption2BycssSelectorDirectChildXpath() throws InterruptedException { // 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectOption2 = driver.findElement(By.cssSelector("(//select  // option)[4]"));
		selectOption2.click();
		Thread.sleep(2000);
	}
	@Test
	public void selectOptionBycssSelectorDirectChildcssSelector() throws InterruptedException { //  "option theke last-child khuje ber kora
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectOption2 = driver.findElement(By.cssSelector("option:last-child")); 
		selectOption2.click();
		Thread.sleep(2000);
	}
	@Test
	public void selectOptionBycssSelectorDirectChildcssSelectorNthchild() throws InterruptedException { //option theke Nth position child khuje ber kora
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectOption2 = driver.findElement(By.cssSelector("option:nth-child(2)")); 
		selectOption2.click();
		Thread.sleep(2000);
	}
	@Test
	public void locatRadioButtonByXpathDirectChildbyXpathNthpositionchild() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobuttonExample = driver.findElement(By.xpath("(//fieldset/legend)[4]"));
		System.out.println(radiobuttonExample.getText());
		Thread.sleep(2000);
	}@Test
	public void locatRadioButtonByXpathDirectChildbyXpathlastchild() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobuttonExample = driver.findElement(By.xpath("(//fieldset/legend)[last()]"));
		System.out.println(radiobuttonExample.getText());
		Thread.sleep(2000);
	}
	@Test
	public void testSearchFieldBycssSelector() throws InterruptedException {  // testSearchField
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement searchInput = driver.findElement(By.cssSelector("input[id='autocomplete']"));
		searchInput.sendKeys("Bangladesh");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}
	
	//findElements
	@Test
	public void locateCheckBoxMultipleAttributeBycssSelector() throws InterruptedException{ //CheckBox Multiple Attribute by one cssSelector(element locate)
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> checkBox1 = driver.findElements(By.cssSelector("input[type='checkbox']"));
		checkBox1.get(0).click();
		checkBox1.get(1).click();
		checkBox1.get(2).click();
		Thread.sleep(2000);
	}
	@Test
	public void option() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.cssSelector("option[value='option3']"));
		option.click();
		Thread.sleep(4000);	
	}
	@Test
	public void locatCheckBoxMultipleAttributeBycssSelector() throws InterruptedException{ //CheckBox Multiple Attribute by one cssSelector(element locate)
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBox1 = driver.findElement(By.cssSelector("input[type='checkbox'][name='checkBoxOption1']"));
		checkBox1.click();
		Thread.sleep(2000);
	}
	@Test
	public void locatCheckBoxMultipleAttributeByXpath() throws InterruptedException{ //CheckBox Multiple Attribute by one Xpath (element locate)
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox' and @name='checkBoxOption1']"));
		checkBox1.click();
		Thread.sleep(4000);
	}
	@Test
	public void locateDropdownExampleSubstringsBycssSelector() throws InterruptedException{ //DropdownExample by using Substrings(contains) locator // kono element er partial value thakle use hoy.
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //cssSelector (element locate) korte [path er vaule te star{*}mark diye korte hoy ] // jemon : select[id *='dropdown-class-automatic']
		WebElement dropdownExample = driver.findElement(By.cssSelector("select[id *='dropdown-class']"));//like {select[id *='dropdown-class']} // ekhne sudu select[id *='dropdown-class'] ses er part automatic baad dileo locate korte pare
		dropdownExample.click();
		Thread.sleep(4000);
	}
	@Test
	public void locateDropdownExampleSubstringsByXpath() throws InterruptedException{ //DropdownExample by using Substrings(contains) diye locate hoy.
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //ByXpath (element locate) korte [path er vaule te attribute er age contains likhe , koma diye value likhte hoy]
		WebElement dropdownExample = driver.findElement(By.xpath("//select[contains(@id,'dropdown-class')]"));//like //select[contains(@id,'dropdown-class')]
		dropdownExample.click();
		Thread.sleep(4000);
	}
	@Test
	public void locateDropdownExampleOptionSubstringsBycssSelctorStartsWith() throws InterruptedException{ //DropdownExample by 1st element diye locate korte hole (select[id ^= 'dropdown-class']) ekhne korte hobe
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //ByXpath (element locate) korte [path er vaule te attribute er age contains likhe , koma diye value likhte hoy]
		WebElement dropdownExample = driver.findElement(By.cssSelector("select[id ^= 'dropdown-class']"));//like //select[contains(@id,'dropdown-class')]
		dropdownExample.click();
		Thread.sleep(4000);
	}
	@Test
	public void locateDropdownExampleOptionSubstringsByXpathStartsWith() throws InterruptedException{ //DropdownExample by 1st element diye locate hoy.
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //ByXpath (element locate) korte [path er vaule te attribute er age contains likhe , koma diye value likhte hoy]
		WebElement dropdownExample = driver.findElement(By.xpath("//select[starts-with(@id, 'dropdown-class-example')]"));//like //select[contains(@id,'dropdown-class')]
		dropdownExample.click();
		Thread.sleep(4000);
	}
	@Test
	public void locateDropdownExampleOptionSubstringsBycssSelctorEndsWith() throws InterruptedException{ //DropdownExample by 1st element diye locate korte hole (select[id ^= 'dropdown-class']) ekhne korte hobe
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //ByXpath (element locate) korte [path er vaule te attribute er age contains likhe , koma diye value likhte hoy]
		WebElement dropdownExample = driver.findElement(By.cssSelector("select[id $='pdown-class-example']"));//like //select[contains(@id,'dropdown-class')]
		dropdownExample.click();
		Thread.sleep(4000);
	}
//	@Test //  endswith xpath is not working
//	public void locateDropdownExampleOptionSubstringsByXpathEndsWith() throws InterruptedException{ //DropdownExample by 1st element diye locate hoy.
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //ByXpath (element locate) korte [path er vaule te attribute er age contains likhe , koma diye value likhte hoy]
//		WebElement dropdownExample = driver.findElement(By.xpath("//select(ends-with[@ id $,'dropdown-class-example'])"));//like //select[contains(@id,'dropdown-class')]
//		dropdownExample.click();
//		Thread.sleep(4000);
//	}	
	@Test
	public void locateOpenTabOptionByXpathWithOutTagName() throws InterruptedException{  // Tag Name use korte na chaile * diye korte hobe
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");               // jemon           //*[@id='opentab']
		WebElement opentab = driver.findElement(By.xpath("//*[@id='opentab']"));
		opentab.click();
		Thread.sleep(4000);
	}
	@Test
	public void locateDropDownpExampleByXpathPrecedingSibling() throws InterruptedException{  // Preceding Sibling [same parant er ak child refernce diye arek child k locate kora]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");                // Preceding Sibling diye akta child k refarence dhore tar ager child k locate kora
		WebElement opentab = driver.findElement(By.xpath("//*[@value='option2'] / preceding-sibling::option")); // Nth position ber korte> // *[@value='option2'] / preceding-sibling::option[2] 
		opentab.click();
		Thread.sleep(4000);
	}
	@Test
	public void locateDropDownpExampleByXpathFollowingSibling() throws InterruptedException{  // Following Sibling [same parant er ak child refernce diye arek child k locate kora]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");                  // Following Sibling diye akta child k refarence dhore tar nicher child k locate kora
		WebElement opentab = driver.findElement(By.xpath("// *[@value='option2'] / following-sibling::option")); // Nth position ber korte> // *[@value='option2'] / following-sibling::option[2] 
		opentab.click();
		Thread.sleep(4000);
	}

}
