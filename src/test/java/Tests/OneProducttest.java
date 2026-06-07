package Tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Base.BasePage;
import Pages.Products_Page;
import Resources.TestData2;
import Utility.Reusable_utility;
import Utility.Utilities;


@Listeners(Resources.TestListener.class)
public class OneProducttest extends BasePage {

	Products_Page page;
	Utilities utility;
	Reusable_utility reuse;
	
	@BeforeClass
	public void init()
	{
		page = new Products_Page(driver);
		utility = new Utilities(driver);
		reuse = new Reusable_utility(driver);
	}
	
	@Test(dataProvider = "Login", dataProviderClass = TestData2.class)
	public void AllProducts(String username, String password) throws InterruptedException
	{
		
		utility.Login(username, password);
		reuse.productspageurl();
		
	    List<WebElement> prod_count = page.products_list();
	    System.out.println(prod_count.size());
	    for(int i=2; i<=prod_count.size();)
	    {	
	  

	    	Thread.sleep(2000);
	    	driver.navigate().refresh();
	    	Utilities.waitForElementVisible(driver, page.ViewProductlink(i), 10);
	    	page.ViewProductlink(i).click();
	    	Thread.sleep(2000);
	    	driver.navigate().refresh();
	    	//page.ViewProductlink(i).click();
	    	System.out.println("Product Name: "+page.Product_name.getText());
	    	System.out.println(page.Product_category.getText());
	    	System.out.println("Price: "+page.Price.getText());
	    	System.out.println(page.Stock.getText());
	    	System.out.println(page.Condition.getText());
	    	System.out.println(page.Brand.getText());
	    	break;
	    }
	}

}
