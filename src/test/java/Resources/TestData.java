package Resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name = "User_details")
	public Iterator<Object[]> getRegistrationData() {

	    List<Object[]> data = new ArrayList<Object[]>();
	    data.add(new Object[]{1, "Vaibhav Sooryavanshi", "vss@gmail.com", "Vs76765@", 15, "November", 2001});
	    return data.iterator();
	   }
		
	@DataProvider(name="Useraddress_info")
	public Iterator<Object[]> getAddressinfo() {
		
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {"Vinay", "Kumar A P", "ITW", "ITW", "Nagawara", "India", "Karnataka", "Bengaluru", "560045", "7894561231"});
		return data.iterator();
	}
	
	@DataProvider(name="Logininfo")
	public Iterator<Object[]> getLogininfo()
	{
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {"vinaykumarap.16is@saividya.ac.in", "Vinay76765@", "Vinay Kumar A P"});
		return data.iterator();
	}
	
	@DataProvider(name="Logindetailsforothertests")
	public Iterator<Object[]> getLoginDetails()
	{
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {"vinaykumarap.16is@saividya.ac.in", "Vinay76765@"});
		return data.iterator();
	}
	
	@DataProvider(name="InvalidLogin")
	public Iterator<Object[]> getInvalidcred()
	{
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {"vinaykumar@gmail.com", "vinay67675@"});
		return data.iterator();
	}
	
	@DataProvider(name="InvalidRegistercreds")
	public Iterator<Object[]> getInvalidregisterinfo()
	{
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {"Vinay Kumar A P", "vinaykumarap.16is@saividya.ac.in"});
		return data.iterator();
	}
	
	@DataProvider(name="ConatctUsdata")
	public Iterator<Object[]> getcontactusdata()
	{
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {"Vinay Kumar A P", "vinay@gmail.com", "ContactUs", "ContactMe", "D:\\Test_Data\\Sample.txt"});
		return data.iterator();
	}
	
	@DataProvider(name="SearchProduct")
	public Iterator<Object[]> getsearchproduct()
	{
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {"Sleeveless Dress"});
		data.add(new Object[] {"Blue Top"});
		data.add(new Object[] {"Stylish Dress"});
		return data.iterator();
		}
	

	@DataProvider(name="Prodcount")
	public Iterator<Object[]> getProdcount()
	{
		List<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {8});
		return data.iterator();
	}
	
}	

	

