package Utility;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.BasePage;
import Pages.Cart_Page;
import Pages.Products_Page;

public class Reusable_utility extends BasePage {
	
	Utilities utility;
	static Products_Page prodpage;
	static Cart_Page cartpage;

	public Reusable_utility(WebDriver driver) {
		super(driver);
		utility = new Utilities(driver);
		prodpage = new Products_Page(driver);
		cartpage = new Cart_Page(driver);
	}
	
	public static void addtoCart(int count)
	{
//		Actions actions = new Actions(driver);
//		actions.moveToElement(prodpage.addtocartbtn(count)).perform();
		Utilities.waitForElementClickable(driver, prodpage.addtocartbtn(count), 5);
		prodpage.addtocartbtn(count).click();
		Utilities.waitForElementClickable(driver, prodpage.Continue_shopping_btn, 5);
		prodpage.Continue_shopping_btn.click();
	}
	
	public static void cartview(int count)
	{
		cartpage.Cartpage_link.click();
		cartpage.cart_products(count);
		for(int i=1; i<=count; i++)
		{
			String cartprice =cartpage.Cart_price(count);
			int price = Integer.parseInt(cartprice.replaceAll("Rs. ", ""));
			System.out.println(price);
			int quantity = Integer.parseInt(cartpage.Cart_qty(count));
			int total = (price * quantity);
			System.out.println(total);
			String totalprice = cartpage.Cart_total(count);
			int totprice = Integer.parseInt(totalprice.replaceAll("Rs. ", ""));
			Assert.assertEquals(totprice, total);
		}
		
	
	}
	
	
	
	public void productspageurl()
	{
		driver.get("https://www.automationexercise.com/products");
	}
	
	
	

}
