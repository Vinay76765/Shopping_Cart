package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Payment_Page  {
	
	WebDriver driver;

	public Payment_Page(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='name_on_card']")
	WebElement Cardname_field;
	
	@FindBy(xpath = "//input[@name='card_number']")
	WebElement Cardnumber_field;
	
	@FindBy(xpath = "//input[@name='cvc']")
	WebElement CVC_field;
	
	@FindBy(xpath = "//input[@name='expiry_month']")
	WebElement Expiry_month;
	
	@FindBy(xpath = "//input[@name='expiry_year']")
	WebElement Expiry_year;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement Confirmorder_btn;
	
	@FindBy(xpath = "//h2/b[text()='Order Placed!']")
	WebElement Order_success_msg;
	
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement Continue_btn;

}
