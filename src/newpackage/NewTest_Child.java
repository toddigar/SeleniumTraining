package newpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 @Listeners(newpackage.NewTest.class)

public class NewTest_Child {
  
  
  
  @Test
  public void ExperitestTitle() 
 { 
 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.experitest.com");
 System.out.print(driver.getTitle());
  driver.quit();
  }
  
   
  
  @Test
  public void ExperitestTitleName() 
  { 
  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.experitest.com"); 
  String Actual = driver.getTitle(); 
  String Expected = "Digital.ai"; 
  if (Actual.equals(Expected)) 
  { 
	  System.out.println("Test Passed!"); 
  }
   else
   { 
	Assert.assertTrue(false);
	} 
  
  	driver.close(); 
  }
 } 
 
 
