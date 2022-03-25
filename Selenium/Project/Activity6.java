import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {

	WebDriver driver;
	Actions a;
	
	@BeforeMethod
    public void beforeMethod() {
		 driver = new FirefoxDriver();
		a= new Actions(driver);
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	
	@Test
	public void Activities () {
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='username_password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//nav[@role='navigation']")).isDisplayed());
		driver.findElement(By.xpath("//a[text()='Activities']")).isDisplayed();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Activities']"))).build().perform();
		driver.findElement(By.xpath("//span[a[text()='Activities']]//a[text()='Home']")).isDisplayed();
		
		
	}
	
	
	
	
	 @AfterMethod
	    public void afterMethod() {
	        driver.quit();
	    }

}
