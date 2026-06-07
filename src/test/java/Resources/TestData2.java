package Resources;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class TestData2 {
	
	@DataProvider(name="Register_Details")
	public Object[][] getRegisterData() throws IOException {

	    return new Object[][]{
	        {
	            dataDriven.getCellData("Register",0,1),
	            dataDriven.getCellData("Register",1,1),
	            dataDriven.getCellData("Register",2,1),
	            dataDriven.getCellData("Register",3,1),
	            dataDriven.getCellData("Register",4,1),
	            dataDriven.getCellData("Register",5,1),
	            dataDriven.getCellData("Register",6,1)
	        }
	        };
	    
	    
	    
	}    
	    @DataProvider(name="Register_Address_Details")
	    public Object[][] getAdrresinfoData() throws IOException
	    {
	    	return new Object[][]{
		        {
		            dataDriven.getCellData("Register",7,1),
		            dataDriven.getCellData("Register",8,1),
		            dataDriven.getCellData("Register",9,1),
		            dataDriven.getCellData("Register",10,1),
		            dataDriven.getCellData("Register",11,1),
		            dataDriven.getCellData("Register",12,1),
		            dataDriven.getCellData("Register",13,1),
		            dataDriven.getCellData("Register",14,1),
		            dataDriven.getCellData("Register",15,1),
		            dataDriven.getCellData("Register",16,1),
		        } 
	    };
	}
	    
	    @DataProvider(name="Login_info")
	    public Object[][] getLoginData() throws IOException
	    {
	    	
	            return new Object[][] {
	            	{
	            		
	            		dataDriven.getCellData("Login_valid_invalid", 0, 1),
	            		dataDriven.getCellData("Login_valid_invalid", 1, 1),
	            		dataDriven.getCellData("Login_valid_invalid", 2, 1)
	            	}
	            };
	
	    }
	    
	    @DataProvider(name="Login")
	    public Object [][] getLogindata() throws IOException
	    {
	    	return new Object[][]
	    	{
	    		{
	    			dataDriven.getCellData("Login_valid_invalid", 0, 1),
            		dataDriven.getCellData("Login_valid_invalid", 1, 1),
	    		}
	    	};
	    }
	    
	    @DataProvider(name="Invalid_Login_info")
	    public Object[][] getInvalidLoginData() throws IOException
	    {
	    	return new Object[][]
	    			{
	    	{
	    		dataDriven.getCellData("Login_valid_invalid", 3, 1),
	    		dataDriven.getCellData("Login_valid_invalid", 4, 1),
	    	}
	    };
	
	    }
	    
	    @DataProvider(name ="Contact_Us")
	    public Object[][] getContactUsData() throws IOException
	    {
	    	return new Object[][]
	    	{	
	    		{
	    			dataDriven.getCellData("Contact_Us", 0, 1),
		    		dataDriven.getCellData("Contact_Us", 1, 1),
		    		dataDriven.getCellData("Contact_Us", 2, 1),
		    		dataDriven.getCellData("Contact_Us", 3, 1),
		    		dataDriven.getCellData("Contact_Us", 4, 1),
	    		}
	    };
	   
	    
	    }
	    
	    
	    @DataProvider(name="Existing_register")
	    public Object[][] getExistingregisterData() throws IOException
	    {
	    	return new Object[][]
	    	{
	    		{
	    			dataDriven.getCellData("Existing_register", 0, 1),
	    			dataDriven.getCellData("Existing_register", 1, 1),
	    		}
	    	};
	    }
	    
}