package Tests;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.Cart_Page;
import Pages.Products_Page;
import Resources.TestData2;
import Utility.Reusable_utility;
import Utility.Utilities;

@Listeners(Resources.TestListener.class)
public class AddtoCartTest extends BasePage {
	
	Cart_Page cart;
	Utilities utility;
	Products_Page page;
	Reusable_utility reuse;
	
	@BeforeClass
	public void init()
	{
		Utilities.setup();
		cart= new Cart_Page(driver);
		page= new Products_Page(driver);
		utility = new Utilities(driver);
		reuse = new Reusable_utility(driver);
	}
	
	
	@Test(dataProvider = "Login", dataProviderClass = TestData2.class)
	public void Login(String username, String password)
	{
		utility.Login(username, password);
	}
	
	
	@Test(dataProvider = "Prodcount", dataProviderClass = TestData2.class)
	public void addproduct(int count)
	{
		reuse.productspageurl();
		List<WebElement> prod_count = page.products_list();
	    System.out.println(prod_count.size());
	    for(int i=2; i<=prod_count.size(); i++)
	    {
	    	while(i<=count)
	    	{
	    		Reusable_utility.addtoCart(i);
	    		i++;
	    	}
	    	
	    }
	}
	
	
	@Test(dataProvider = "Prodcount", dataProviderClass = TestData2.class)
	public void verifycart(int count)
	{
		Reusable_utility.cartview(count-1);
	}
	
	@AfterTest
	public void teardown()
	{
		Utilities.tearDown();
	}

}
