package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Profile {
	
	WebDriver driver;	

	public  Profile(WebDriver driver) {
		this.driver = driver;
	}
	
		//Locator for username field
		By btnGotoSTore = By.id("gotoStore");
		//By btnGotoSTore = By.name("gotoStore");
		//Locator for password field
		By txtsearch = By.id("searchBox");
		
		//Locator for login button
		By loginBtn = By.id("login");
		
		
		//Method to enter username
		public void enterSearch(String user) {
			driver.findElement(txtsearch).sendKeys(user);
		}		
		
		//Method to click on Login button
		public void clickGotoStore() {
			driver.findElement(btnGotoSTore).click();
		}	
}
