package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import Config.Config_reader;

public class BasePage {
	
	protected static WebDriver driver;
	static Config_reader config;
	
	public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public BasePage() {
        //Required for TestNG test classes
    }
	


    @BeforeClass
    public static void setup() {
    	config = new Config_reader();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(config.getUrl());
        
     }
    
   
    
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    @AfterClass(alwaysRun = true)
    public static void D_close()
    {
    	if(driver !=null)
    	{
    		driver.close();
    	}
    }
    
    public WebDriver getDriver()
    {
    	return driver;
    }
    
    
}
