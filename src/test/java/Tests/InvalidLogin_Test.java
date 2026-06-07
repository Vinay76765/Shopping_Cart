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
public class InvalidLogin_Test extends BasePage {
	
	Accounts_Page page;
	Register_User_Page user;
	
	@BeforeClass
	public void init()
	{
	
		page = new Accounts_Page(driver);
		user = new Register_User_Page(driver);
	}
	
	@Test(dataProvider = "Invalid_Login_info", dataProviderClass = TestData2.class)
	public void Invalidlogin(String Invalidusername, String Invalidpassword)
	{
		user.Signuploginlink.click();
		page.email_field.sendKeys(Invalidusername);
		page.password_field.sendKeys(Invalidpassword);
		page.Login_btn.click();
		String errormsg = page.Invalid_cred_error_msg.getText();
		Assert.assertEquals(errormsg, "Your email or password is incorrect!");
	}
	
	

}
