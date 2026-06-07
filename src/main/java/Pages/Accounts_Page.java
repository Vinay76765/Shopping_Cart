package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Base.BasePage;

public class Accounts_Page extends BasePage {
	
//	WebDriver driver;
	
	public Accounts_Page(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//form[@action='/login']//input[@name='email']")
	public WebElement email_field;
	
	@FindBy(xpath = "//form[@action='/login']//input[@name='password']")
	public WebElement password_field;
	
	@FindBy(xpath = "//button[text()= 'Login']")
	public WebElement Login_btn;
	
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a/b")
	public WebElement Logged_in_name;
	
	@FindBy(xpath = "//h2/b[text()='Account Deleted!']")
	public WebElement Account_delete_msg;
	
	@FindBy(xpath = "//form[@action='/login']/p")
	public WebElement Invalid_cred_error_msg;
	
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[.=' Logout']")
	public WebElement Logout_btn;
		
	
}
