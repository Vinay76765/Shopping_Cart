package Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	int count = 0;
	int maxtry = 2;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<maxtry)
		{
			count++;
			System.out.println("Retrying Test : "
                    + result.getName()
                    + " Retry Count : "
                    + count);
			
			return true;
		}
		return false;
	}

}
