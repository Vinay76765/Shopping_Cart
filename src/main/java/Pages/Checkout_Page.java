package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Checkout_Page {
	
	WebDriver driver;

	public Checkout_Page(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	WebElement Checkout_btn;
	
	@FindBy(xpath = "//ul[@id='address_delivery']//li[contains(@class,'address_lastname')]")
	WebElement D_firstname_lastname;
	
	@FindBy(xpath = "//ul[@id='address_delivery']//li[contains(@class,'address_address1')][1]")
	WebElement D_address1;
	
	@FindBy(xpath = "//ul[@id='address_delivery']//li[contains(@class,'address_address1')][2]")
	WebElement D_address2;
	
	@FindBy(xpath = "//ul[@id='address_delivery']//li[contains(@class,'address_address1')][3]")
	WebElement D_address3;
	
	@FindBy(xpath = "//ul[@id='address_delivery']//li[contains(@class,'country_name')]")
	WebElement D_state;
	
	@FindBy(xpath = "//ul[@id='address_delivery']//li[contains(@class,'address_phone')]")
	WebElement D_Phone;
	
	@FindBy(xpath = "//ul[@id='address_invoice']//li[contains(@class,'address_lastname')]")
	WebElement B_firstname_lastname;
	
	@FindBy(xpath = "//ul[@id='address_invoice']//li[contains(@class,'address_address1')][1]")
	WebElement B_address1;
	
	@FindBy(xpath = "//ul[@id='address_invoice']//li[contains(@class,'address_address1')][2]")
	WebElement B_address2;
	
	@FindBy(xpath = "//ul[@id='address_invoice']//li[contains(@class,'address_address1')][3]")
	WebElement B_address3;
	
	@FindBy(xpath = "//ul[@id='address_invoice']//li[contains(@class,'country_name')]")
	WebElement B_state;
	
	@FindBy(xpath = "//ul[@id='address_invoice']//li[contains(@class,'address_phone')]")
	WebElement B_Phone;
	
	@FindBy(xpath= "//tr[@id='product-1']//td[@class='cart_price']/p")
	WebElement Prod1_price;
	
	@FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_total']/p")
	WebElement Prod1_total_price;
	
	@FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_price']/p")
	WebElement Prod2_price;
	
	@FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_total']/p")
	WebElement Prod2_total_price;
	
	@FindBy(xpath = "//div[@id='cart_info']//tbody//tr[3]//td/p[@class='cart_total_price']")
	WebElement Total_amount;
	
	@FindBy(xpath = "//div[@id='ordermsg']/textarea[@name='message']")
	WebElement Description_field;
	
	@FindBy(xpath = "//a[text()='Place Order']")
	WebElement Place_order_btn;
}
