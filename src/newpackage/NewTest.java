package newpackage;

import org.testng.annotations.Test;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NewTest implements ITestListener {
	
	
	@Override public void onTestSuccess(ITestResult expresult) {
		 System.out.print("Test passed. Details are "+ expresult.getName());
	}
	
	@Override public void onTestFailure(ITestResult expresult)
	{ 
		System.out.print("Test Failed. Details are"+expresult.getName()); 
	}
  
}
