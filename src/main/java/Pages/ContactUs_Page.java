package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ContactUs_Page extends BasePage {
	
//	WebDriver driver;
	
	public ContactUs_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[text()=' Contact us']")
	public WebElement ContactUs_link;
	
	@FindBy(xpath = "//h2[text()='Get In Touch']")
	public WebElement GetIntouch_msg;
	
	@FindBy(xpath = "//input[@name='name']")
	public WebElement Name_field;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement Email_Field;
	
	@FindBy(xpath = "//input[@name='subject']")
	public WebElement Subject_field;
	
	@FindBy(css = "#message")
	public WebElement Message_field;
	
	@FindBy(xpath = "//input[@name='upload_file']")
	public WebElement upload_field;
	
	@FindBy(xpath = "//input[@name='submit']")
	public WebElement Submit_btn;
	
	//Contains alert which need to be performed through separate logic
	
	@FindBy(xpath = "//div[@class='contact-form']//div[text()='Success! Your details have been submitted successfully.']")
	public WebElement Success_message;
	
	@FindBy(xpath = "//div[@id='form-section']//span")
	public WebElement Home_button;
	
	

}
