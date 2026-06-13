package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.BasePage;
import Pages.Accounts_Page;
import Pages.Products_Page;
import Pages.Register_User_Page;

public class Utilities extends BasePage {
	
	Accounts_Page page;
	Register_User_Page registerpage;
	Products_Page prodpage;
	Reusable_utility reuse;
	public static WebDriverWait wait;
	
	
	
	public Utilities(WebDriver driver) {
		super(driver);
		page = new Accounts_Page(driver);
		registerpage = new Register_User_Page(driver);
		prodpage = new Products_Page(driver);
	}
	
	
	public static void getScreenshot(WebDriver driver, String Testname)
	{
		
		
		String folderPath = System.getProperty("user.dir") + "/FailedScreenshots";

	     File folder = new File(folderPath);
	     if (!folder.exists()) {
	         folder.mkdir();
	     }

	     String timestamp =
	    	        new SimpleDateFormat("yyyyMMdd_HHmmss")
	    	                .format(new Date());


	     File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     File dest = new File(folderPath + "/"+ Testname+ "_" + timestamp + ".png");

	     try {
	         FileUtils.copyFile(src, dest);
	         System.out.println("Screenshot stored at: " + dest.getAbsolutePath());
	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	 }
	
	
	public static Alert waitforalert()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static void waitForElementVisible(WebDriver driver, WebElement element,int timeout) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

	public static void waitForElementClickable(WebDriver driver, WebElement element, int timeout) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        
	}
	
	public  void Login(String username, String password)
	{
		
		registerpage.Signuploginlink.click();
		page.email_field.sendKeys(username);
		page.password_field.sendKeys(password);
		page.Login_btn.click();
	}
	
	
	public static void rejectCookiesIfPresent() {
	    try {
	        WebElement buttons = driver.findElement(By.xpath(
	            "//div[@id='dismiss-button-element']/div[.='Close']"
	        ));
	        waitForElementClickable(driver, buttons, 4);
	        }catch (Exception e) {
	        // ignore
	    }
	
	}
	public static void iframeremove()
	{
		((JavascriptExecutor) driver).executeScript(
			    "document.querySelectorAll(\"iframe, div[id^='aswift']\").forEach(e => e.remove());;"
			);
	}
	

	public void searchproductdetails(String product)
	{
		reuse.productspageurl();
		Utilities.waitForElementVisible(driver, prodpage.Search_prod_field, 5);
		prodpage.Search_prod_field.sendKeys(product);
		prodpage.Search_prod_btn.click();
		
	}
	
	public static void navigateback()
	{
		driver.navigate().back();
	}
	
	


	
}
	


