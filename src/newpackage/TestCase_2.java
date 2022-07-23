package newpackage;
import Pages.HomePage;
import Pages.Profile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TestCase_2 {
	
	
	//public static void main(String[] args){
		
		
		// Reading the data from excel
	
	
	
	WebDriver driver;
		
		@Test()
		public void tc001() {
			try {
				
			FileInputStream fis = new FileInputStream("C:\\deepak\\Test.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			                        
			//Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			System.out.println(cell);
			System.out.println(sheet.getRow(0).getCell(0));
			XSSFCell xldata = sheet.getRow(0).getCell(0);
			// varible store data from excel file
			String uname = xldata.getStringCellValue();
				
			System.setProperty("webdriver.chrome.driver", "C:\\deepak\\TestingDoc\\SeleniumInstallation\\chromedriver_win32\\chromedriver.exe"); 
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/login");
			Reporter.log("The browser is open");
			driver.manage().window().maximize();			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			long startTime = System.currentTimeMillis();
			//Reporter.log("The browser is maximize");
			//Assert.assertEquals("Login in Book Store",driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[1]/h5")).getText());
			//Reporter.log("Assert passed login");
		//Creating object of home page
				HomePage home = new HomePage(driver);				
				home.enterUsername(uname);
				long endTime = System.currentTimeMillis();				
				Reporter.log("the username entered");
				long totalTime = endTime - startTime;
				System.out.println("Total Page Load Time: " + totalTime + " milliseconds");
				long startTime1 = System.currentTimeMillis();
				Thread.sleep(4000);
				home.enterPassword("East@123");
				long endTime1 = System.currentTimeMillis();	
				long totalTime1 = endTime1 - startTime1;
				System.out.println("Total Page Load Time: " + totalTime1 + " milliseconds");
				home.clickLogin();
				Thread.sleep(4000);
				//verify the page load
				Assert.assertEquals("Profile",driver.findElement(By.xpath("//div[@class ='main-header']")).getText());
				Reporter.log("Assert passed profile page");
				Profile pf = new Profile(driver);
				//scroll to element
				WebElement element = driver.findElement(By.id("gotoStore"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(500); 
				pf.clickGotoStore();
				Thread.sleep(4000);		
				
				pf.enterSearch("Richard E. Silverman");				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));					
							
				Assert.assertEquals("Richard E. Silverman",driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[3]")).getText());
				//driver.close();
				Reporter.log("Assert passed Author verification");
			
		
		}catch(Exception e)
		{
		
			System.out.println(e.getMessage());
		}
			
		}
		
		@Test()
		public void tc002() {
			
				System.setProperty("webdriver.chrome.driver", "C:\\deepak\\TestingDoc\\SeleniumInstallation\\chromedriver_win32\\chromedriver.exe"); 
				WebDriver driver = new ChromeDriver();
				//driver = new ChromeDriver();// Object is created- Chrome browser is opened
			
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/login");
				Reporter.log("The browser is open");		
		
		    }
		
		@BeforeTest
		public void SetDriver(){		 
		//Mention the location of chromeDriver in localsystem
		//System.setProperty("webdriver.chrome.driver", "C:\\deepak\\TestingDoc\\SeleniumInstallation\\chromedriver_win32\\chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		//driver = new ChromeDriver();// Object is created- Chrome browser is opened
		//driver.manage().window().maximize();			
		}
		
		@AfterTest
		public void closedriver(){
		 
		//closes the browser instance
		//driver.close();
		 
		}
		
	
		
		
		
		
		
		@BeforeMethod
		public void beforeMethod() {
			Reporter.log("The browser is before method");
		}
		
		@AfterMethod
		public void afterMethod() {
			Reporter.log("The browser is after method");
			//driver.quit();
		}
	}

//}
