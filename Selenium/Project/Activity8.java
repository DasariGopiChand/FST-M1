import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.auto.common.Visibility;

import io.netty.util.Timeout;

public class Activity8 {
	Actions a;
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        a = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	
	@Test
	public void AddInfoSales () throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='username_password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//nav[@role='navigation']")).isDisplayed());
		driver.findElement(By.xpath("//a[text()='Sales']")).isDisplayed();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Sales']"))).build().perform();
		driver.findElement(By.xpath("//span[a[text()='Sales']]//a[text()='Accounts']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]/td/span/span[@title='Additional Details']")));
		for (int i= 1 ; i<=9; i=i+2) {
			System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td/b/a")).getText());
			
		}
		
	}
	
	 @AfterMethod
	    public void afterMethod() {
	        driver.quit();
	    }

}
