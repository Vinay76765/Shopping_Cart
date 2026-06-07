package Tests;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Config.Config_reader;
import Pages.Register_User_Page;
import Resources.TestData2;
import Utility.Utilities;

@Listeners(Resources.TestListener.class)
public class Register_test extends BasePage {
	
	Register_User_Page user;
	Config_reader config;
	Utilities util;
	
	
	
	@BeforeClass
	public void init()
	{
		user = new Register_User_Page(driver);
		config = new Config_reader();
		util = new Utilities(driver);
		
	}

	@Test(dataProvider = "Register_Details", dataProviderClass = TestData2.class)
	public void register_user(String gender, String name, String email, String password, String DOB, String MOB, String YOB) throws InterruptedException
	{
		
		user.Signuploginlink.click();
		user.Signup_Name.sendKeys(name);
		user.Signup_Email.sendKeys(email);
		user.Signup_btn.click();
		Thread.sleep(2000);
		user.Gender_select(gender).click();
		String username = user.Name.getAttribute("value");
		System.out.println(username);
		Assert.assertEquals(username, name);
		String useremail = user.Email.getAttribute("value");
		System.out.println(useremail);
		Assert.assertEquals(useremail, email);
		user.password.sendKeys(password);
		user.Sendbday(DOB).click();
		user.Sendbmonth(MOB).click();
		user.Sendbyear(YOB).click();
		
	}
	
	@Test(dependsOnMethods = "register_user" ,dataProvider = "Register_Address_Details", dataProviderClass = TestData2.class)
	public void Address_information(String firstname, String lastname, String company, String Address1, String Address2, String country, String State, String City, String zipcode, String mobnumber) throws InterruptedException
	{
		Thread.sleep(2000);
		user.First_name.sendKeys(firstname);
		user.Last_Name.sendKeys(lastname);
		user.Company.sendKeys(company);
		user.address1.sendKeys(Address1);
		user.address2.sendKeys(Address2);
		user.addcountry(country).click();
		user.State.sendKeys(State);
		user.City.sendKeys(City);
		user.Zipcode.sendKeys(zipcode);
		user.Mobile_number.sendKeys(mobnumber);
		Utilities.waitForElementClickable(driver, user.Create_accnt_btn, 5);
		user.Create_accnt_btn.click();
		String message = user.Account_created_msg.getText();
		Assert.assertEquals("ACCOUNT CREATED!", message);
		user.Continue_btn.click();
		Thread.sleep(2000);
		
	}
	
	
	
	
	

}
