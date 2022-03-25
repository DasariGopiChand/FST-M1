import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {

	WebDriver driver;
	
	@BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	
	@Test
	public void CopyRightText() {
	System.out.println(driver.findElement(By.xpath("//div[@class='p_login_bottom']/a[1]")).getText());

	}
	
	 @AfterMethod
	    public void afterMethod() {
	        driver.quit();
	    }

}
