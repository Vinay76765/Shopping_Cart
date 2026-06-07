package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;


public class Products_Page extends BasePage {
	
	

	public Products_Page(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()=' Products']/i")
	public WebElement Products_link;
	
	public List<WebElement> products_list()
	{
		return driver.findElements(By.xpath("//div[@class='col-sm-9 padding-right']/div/div"));
	}
	
	public WebElement ViewProductlink(int count)
	{
		return driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']/div/div["+count+"]//a[text()='View Product']"));
	}
	
	@FindBy(xpath = "//div[@class='product-information']//h2")
	public WebElement Product_name;
	
	@FindBy(xpath = "//div[@class='product-information']//p[contains(text(), 'Category:')]")
	public WebElement Product_category;
	
	@FindBy(xpath = "//div[@class='product-information']//span/span")
	public WebElement Price;
	
	@FindBy(xpath = "//div[@class='product-information']//p[2]")
	public WebElement Stock;
	
	@FindBy(xpath = "//div[@class='product-information']//p[3]")
	public WebElement Condition;
	
	@FindBy(xpath = "//div[@class='product-information']//p[4]")
	public WebElement Brand;
	
	@FindBy(xpath = "//div[@class='col-sm-9 padding-right']/div/div[2]")
	public WebElement First_product_link;
	
	@FindBy(xpath = "//div[@class='col-sm-9 padding-right']/div/div[3]")
	public WebElement Second_product_link;
	
	public WebElement addtocartbtn(int count)
	{
		return driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']/div/div["+count+"]//div[@class='productinfo text-center']//a[.='Add to cart']"));
	}
	
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	public WebElement Continue_shopping_btn;
	
	@FindBy(xpath = "//div[@class='productinfo text-center']/p")
	public WebElement searchprodname;
	
	//Category products xpath
	
	@FindBy(xpath = "//div[@id='accordian']//a[@href='#Women']/span")
	public WebElement Women_category_drop;
	
	public WebElement Women_category_items(String items)
	{
		return driver.findElement(By.xpath("//div[@id='Women']//a[text()='"+items+ "']"));
	}
	
	@FindBy(xpath = "//div[@id='accordian']//a[@href='#Men']/span")
	public WebElement Men_category_drop;
	
	public WebElement Men_category_items(String items)
	{
		return driver.findElement(By.xpath("//div[@id='Men']//a[text()='"+items+ "']"));
				
	}
	
	@FindBy(xpath = "//div[@id='accordian']//a[@href='#Kids']/span")
	WebElement Kids_Category_drop;
	
	public WebElement Kids_category_items(String items)
	{
		return driver.findElement(By.xpath("//div[@id='Kids']//a[text()='"+items+ "']"));
	}
	
	public WebElement Brand_produts(String brands)
	{
		return driver.findElement(By.xpath("//div[@class='brands-name']//li/a[text()='"+brands+"']"));
	}
	
	public WebElement Verify_brand_products(String Brand)
	{
		return driver.findElement(By.xpath("//div[@class='features_items']//h2[text()='Brand - "+Brand+" Products']"));
	}
	
	//Future scenario :- the number of products for particular brand that many products should be there in the list.
	
	@FindBy(xpath = "//input[@id='search_product']")
	public WebElement Search_prod_field;
	
	@FindBy(xpath = "//button[@id='submit_search']")
	public WebElement Search_prod_btn;
	
	@FindBy(xpath = "//div[@class='logo pull-left']/a")
	public WebElement web_logo;
	
	
	
	

}
