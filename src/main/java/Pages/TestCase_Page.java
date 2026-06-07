package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;


public class TestCase_Page extends BasePage {
	

	public TestCase_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[text()=' Test Cases']")
	public WebElement Testcases_link;
	
	@FindBy(xpath = "//h2/b[text()='Test Cases']")
	public WebElement TestCase_heading;
	
	@FindBy(xpath = "//input[@id='search_product']")
	public WebElement Search_product;
	
	
	
	
	
	

}
