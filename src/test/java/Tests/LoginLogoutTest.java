package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.Accounts_Page;
import Pages.Register_User_Page;
import Resources.TestData2;

@Listeners(Resources.TestListener.class)
public class LoginLogoutTest extends BasePage {
	
	Accounts_Page page;
	Register_User_Page user;
	
	@BeforeClass
	public void init()
	{
		
		page = new Accounts_Page(driver);
		user = new Register_User_Page(driver);
		
	}
	
	@Test(dataProvider = "Login_info", dataProviderClass = TestData2.class)
	public void Loginuser(String username, String password, String loggedinname) throws InterruptedException
	{
		user.Signuploginlink.click();
		page.email_field.sendKeys(username);
		page.password_field.sendKeys(password);
		page.Login_btn.click();
		Thread.sleep(2000);
		String name = page.Logged_in_name.getText();
		Assert.assertEquals(loggedinname, name);
	}
	
	@Test
	public void Logoutuser()
	{
		page.Logout_btn.click();
	}

	

}
