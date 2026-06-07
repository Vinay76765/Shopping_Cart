package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Subscription_Page {
	
	WebDriver driver;

	public Subscription_Page(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
		
	}
	
	//Scrolldown logic should be added
	
	@FindBy(xpath ="//h2[text()='Subscription']")
	WebElement Subscription_text;

	@FindBy(xpath = "//input[@id='susbscribe_email']")
	WebElement Subscription_field;
	
	@FindBy(xpath = "//div[@id='success-subscribe']/div[text()='You have been successfully subscribed!']")
	WebElement Subscrition_success_msg;
	
	@FindBy(xpath = "//a[text()=' Cart']")
	WebElement CarPage_link;
	
	
}
