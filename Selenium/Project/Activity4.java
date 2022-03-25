import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

	WebDriver driver;
	
	@BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	
	@Test
	public void LogIn() {
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='username_password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//nav[@role='navigation']")).isDisplayed());
	}
	
	
	
	
	 @AfterMethod
	    public void afterMethod() {
	        driver.quit();
	    }

}
