package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;


public class Register_User_Page extends BasePage {
	
	public Register_User_Page(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li/a[.=' Signup / Login']")
	public WebElement Signuploginlink;
	
	@FindBy(xpath = "//button[text()='Signup']")
	public WebElement Signup_btn;
	
	@FindBy(xpath = "//input[@placeholder='Name' and @name='name']")
	public WebElement Signup_Name;
	
	@FindBy(xpath = "//form[@action='/signup']/input[@placeholder='Email Address']")
	public WebElement Signup_Email;
	
	public WebElement Gender_select(String gender)
	{
		return driver.findElement(By.xpath("//input[@id='id_gender"+gender+"']"));
	}
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement Name;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement Email;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	public WebElement Sendbday(String Date)
	{
		return driver.findElement(By.xpath("//div[@id='uniform-days']/select/option[@value='"+Date+"']"));
	}
	
	public WebElement Sendbmonth(String month)
	{
		return driver.findElement(By.xpath("//div[@id='uniform-months']/select/option[text()='"+month+"']"));
	}
	
	public WebElement Sendbyear(String year)
	{
		return driver.findElement(By.xpath("//div[@id='uniform-years']/select/option[@value='"+year+"']"));
	}
	
	
	@FindBy(xpath = "//input[@id='newsletter']")
	public WebElement newscheckbox;
	
	@FindBy(xpath = "//label[contains(text(), 'Receive')]")
	public WebElement offerscheckbox;
	
	@FindBy(xpath = "//input[@id= 'first_name']")
	public WebElement First_name;
	
	@FindBy(xpath = "//input[@id='last_name']")
	public WebElement Last_Name;
	
	@FindBy(xpath = "//input[@id='company']")
	public WebElement Company;
	
	@FindBy(xpath = "//input[@id='address1']")
	public WebElement address1;
	
	@FindBy(xpath = "//input[@id='address2']")
	public WebElement address2;
	
	public WebElement addcountry(String country)
	{
		return driver.findElement(By.xpath("//select[@id='country']//option[@value='"+country+"']"));
	}
	
	@FindBy(xpath = "//input[@id='state']")
	public WebElement State;
	
	@FindBy(xpath = "//input[@id='city']")
	public WebElement City;
	
	@FindBy(xpath= "//input[@id='zipcode']")
	public WebElement Zipcode;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	public WebElement Mobile_number;
	
	@FindBy(xpath = "//button[text()='Create Account']")
	public WebElement Create_accnt_btn;
	
	@FindBy(xpath = "//h2/b[text()='Account Created!']")
	public WebElement Account_created_msg;
	
	@FindBy(xpath = "//a[text()='Continue']")
	public WebElement Continue_btn;
	
	@FindBy(xpath = "//form[@action='/signup']/p")
	public WebElement Signup_error_msg;
	
	

}
