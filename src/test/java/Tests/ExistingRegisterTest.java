package Tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Base.BasePage;
import Pages.Register_User_Page;
import Resources.TestData2;

@Listeners(Resources.TestListener.class)
public class ExistingRegisterTest extends BasePage {
	
	Register_User_Page user;
	
	@BeforeClass
	public void init()
	{
		user = new Register_User_Page(driver);
	}
	
	@Test(dataProvider = "Existing_register", dataProviderClass = TestData2.class)
	public void Invaliduser_register(String name, String email)
	{
		user.Signuploginlink.click();
		user.Signup_Name.sendKeys(name);
		user.Signup_Email.sendKeys(email);
		user.Signup_btn.click();
		String errormsg = user.Signup_error_msg.getText();
		Assert.assertEquals(errormsg, "Email Address already exist!");
	}
}
