package Resources;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.BasePage;
import Utility.Utilities;

public class TestListener implements ITestListener{
	
	public void onTestFailure(ITestResult result)
	{
		try
		{
			System.out.println("===== onTestFailure Triggered =====");
			Object currentClass = result.getInstance();
			WebDriver driver = ((BasePage) currentClass).getDriver();
			System.out.println("Driver from listener = " + driver);
			Utilities.getScreenshot(driver, result.getName());
			System.out.println("Screenshot method completed");
		}
	catch(Exception e)
	{
		System.out.println("Listener Exception:");
		e.printStackTrace();
	}
	
	}

}
