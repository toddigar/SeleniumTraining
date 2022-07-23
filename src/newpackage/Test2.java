package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.log.Log;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test2 {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\deepak\\TestingDoc\\SeleniumInstallation\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/login");
		
		//driver.findElement(By.);
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@id ='userName1']"));
		
	}catch(Exception e)

	{
	
		System.out.println(e.getMessage());
	}
		// TODO Auto-generated method stub

	}

}
