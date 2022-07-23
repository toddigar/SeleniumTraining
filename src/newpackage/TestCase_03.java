package newpackage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TestCase_03 {
		
	//public static void main(String[] args){
		
		
		// Reading the data from excel
		WebDriver driver;
		@Test
		public void tc_001() {
			 //System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
			//System.setProperty("webdriver.chrome.driver", "C:\\deepak\\TestingDoc\\SeleniumInstallation\\chromedriver_win32\\chromedriver.exe"); 
			//WebDriver driver = new ChromeDriver();
			//driver.get("https://demoqa.com/login");
			Reporter.log("The browser is open");
			driver.manage().window().maximize();
			Reporter.log("The browser tc_001");	// Verify the page is loaded 			
			Assert.assertEquals("Login in Book Store",driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[1]/h5")).getText());			
			String aa;	
			/*
			 * //Creating object of home page HomePage home = new HomePage(driver);
			 * home.enterUsername("deepak"); Reporter.log("the username entered");
			 * home.enterPassword("East@123"); home.clickLogin();
			 */			
				//driver.close();		
		}
		
		@Test
		public void tc_002() {
			//System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
			//System.setProperty("webdriver.chrome.driver", "C:\\deepak\\TestingDoc\\SeleniumInstallation\\chromedriver_win32\\chromedriver.exe"); 
			//WebDriver driver = new ChromeDriver();
			//driver.get("https://demoqa.com/login");
			Reporter.log("The browser is open");
			driver.manage().window().maximize();
			Reporter.log("The browser is tc_002");		// Verify the page is loaded 			
			Assert.assertEquals("Login in Book Store",driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[1]/h5")).getText());			
			String aa;	
			/*
			 * //Creating object of home page HomePage home = new HomePage(driver);
			 * home.enterUsername("deepak"); Reporter.log("the username entered");
			 * home.enterPassword("East@123"); home.clickLogin();
			 */			
				//driver.close();		
		}
		
		
		
		
		
		 @BeforeMethod 
		 //@Parameters("browser")
		 public void beforeMethod() {			 
		 //System.setProperty("webdriver.chrome.driver", "C:\\deepak\\TestingDoc\\SeleniumInstallation\\chromedriver_win32\\chromedriver.exe"); 
		 //driver = new ChromeDriver();
			 DesiredCapabilities cap = new DesiredCapabilities();
			 cap.setCapability("browserName", "chrome");
			 try {
				 driver = new RemoteWebDriver(new URL("http://43.204.111.239:4444/wd/hub"),cap);
			 }catch(Exception e) {
				 
				 Reporter.log(e.getMessage()); 
			 }
		 Reporter.log("The browser is before method");
		 //Thread.sleep(4000);	
		 //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/login");
		 
		 }
		 
		  @AfterMethod 
		  public void afterMethod() {
			  Reporter.log("The browser is after method");
			  driver.quit();
			  }
		  }
		
		
		
	


