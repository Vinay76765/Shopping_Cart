package Tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Base.BasePage;
import Pages.ContactUs_Page;
import Resources.TestData2;
import Utility.Utilities;

@Listeners(Resources.TestListener.class)
public class ContactUsTest extends BasePage {
	
	ContactUs_Page contact;
	Utilities utility;
	
	@BeforeClass
	public void init()
	{
		contact = new ContactUs_Page(driver);
		utility = new Utilities(driver);
		
	}
	
	@Test(dataProvider = "Contact_Us", dataProviderClass=TestData2.class)
	public void ContactUs(String Name, String Email, String Subject, String Message, String file)
	{
		contact.ContactUs_link.click();
		String message = contact.GetIntouch_msg.getText();
		Assert.assertEquals(message, "GET IN TOUCH");
		contact.Name_field.sendKeys(Name);
		contact.Email_Field.sendKeys(Email);
		contact.Subject_field.sendKeys(Subject);
		contact.Message_field.sendKeys(Message);
		contact.upload_field.sendKeys(file);
		contact.Submit_btn.click();
		Alert alert = Utilities.waitforalert();
		alert.accept();
		String successmsg = contact.Success_message.getText();
		Assert.assertEquals(successmsg, "Success! Your details have been submitted successfully.");
		contact.Home_button.click();
	}

}
