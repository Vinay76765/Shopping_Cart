package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class Cart_Page extends BasePage {
	
//	WebDriver driver;

	public Cart_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[text()=' Cart']")
	public WebElement Cartpage_link;

	
	public String Cart_price(int count)
	{
		return driver.findElement(By.xpath("//table[@id='cart_info_table']//tr["+count+"]/td[@class='cart_price']")).getText();
	}

	
	public String Cart_qty(int count)
	{
		return driver.findElement(By.xpath("//table[@id='cart_info_table']//tr["+count+"]/td[@class='cart_quantity']/button")).getText();
	}
	
	public String Cart_total(int count)
	{
		return driver.findElement(By.xpath("//table[@id='cart_info_table']//tr["+count+"]/td[@class='cart_total']/p")).getText();
	}
	
	@FindBy(xpath = "//table[@id='cart_info_table']//tbody")
	List<WebElement> cart_products_count;
	
	public WebElement cart_products(int count)
	{
		return driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr["+count+"]"));
	}
	
	@FindBy(xpath = "//a[@data-product-id='1']")
	public WebElement Remove_product;
	
	
	
	
	
	

}
