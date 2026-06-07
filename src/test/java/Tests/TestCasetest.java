package Tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Base.BasePage;
import Pages.TestCase_Page;


@Listeners(Resources.TestListener.class)
public class TestCasetest extends BasePage {
	
	TestCase_Page testpage;
	
	@BeforeClass
	public void init()
	{
		testpage = new TestCase_Page(driver);
	}
	
	@Test
	public void TestCase()
	{
		testpage.Testcases_link.click();
		String heading = testpage.TestCase_heading.getText();
		Assert.assertEquals(heading, "TEST CASES");
	}
}
