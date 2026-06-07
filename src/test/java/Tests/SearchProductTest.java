package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Base.BasePage;
import Pages.Products_Page;
import Pages.TestCase_Page;
import Resources.TestData;
import Utility.Utilities;


@Listeners(Resources.TestListener.class)
public class SearchProductTest extends BasePage {
	
	Products_Page page;
	Utilities utility;
	TestCase_Page tcpage;
	
	@BeforeClass
	public void init()
	{
		page = new Products_Page(driver);
		utility = new Utilities(driver);
		tcpage = new TestCase_Page(driver);
	}
	
	
	
	@Test(dataProvider = "Logindetailsforothertests", dataProviderClass = TestData.class)
	public void Login(String username, String password)
	{
		utility.Login(username, password);
		
	}
	
	
	@Test(dataProvider = "SearchProduct", dataProviderClass = TestData.class)
	public void SearchProduct(String product)
	{	
		
		utility.searchproductdetails(product);
		String prodname = page.searchprodname.getText();
		System.out.println(prodname);
		Utilities.navigateback();
		Utilities.waitForElementVisible(driver, page.Search_prod_field, 3);
		page.Search_prod_field.clear();
		
	}

}
