import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

	WebDriver driver;
	
	@BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	
	@Test
	public void HeaderSuiteCRM() {
		System.out.println(driver.findElement(By.xpath("//div[@class='companylogo']/img")).getAttribute("src"));

	}
	
	
	
	
	 @AfterMethod
	    public void afterMethod() {
	        driver.quit();
	    }

}
