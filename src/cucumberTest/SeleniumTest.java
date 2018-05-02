package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

import org.openqa.selenium.*;

public class SeleniumTest {

	private static WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jshrag3\\Desktop\\my data\\Professional\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jshrag3\\Desktop\\my data\\Professional\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email_create")).sendKeys("raghavrock786@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Raghav");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Sharma");
		
		driver.findElement(By.id("passwd")).sendKeys("wipro123");
		
		driver.findElement(By.id("firstname")).sendKeys("Raghav");
		
		driver.findElement(By.id("lastname")).sendKeys("Sharma");
		
		driver.findElement(By.id("address1")).sendKeys("Tathawade");
		
		driver.findElement(By.id("city")).sendKeys("Pune");
		
		Select statedropdown = new Select(driver.findElement(By.id("id_state")));
		 
		statedropdown.selectByVisibleText("Alabama");
		 
		driver.findElement(By.id("postcode")).sendKeys("35006");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("8128950940");
		 
		driver.findElement(By.id("submitAccount")).click();
		 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		System.out.println("Account Created Successfully");
		 
		driver.findElement(By.className("logout")).click();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		System.out.println("Successfully Logged Out");
		
		driver.quit();
		
		 String actual_msg = driver.findElement(By.className("alert alert-danger")).getText();
		 String expect_msg = "An account using this email address has already been registered. Please enter a valid password or request a new one";
		 
		 if(actual_msg == expect_msg)
		 {
			 System.out.println("Account already registered with this mail id. Enter New One");
			 driver.findElement(By.id("email_create")).clear();
			 driver.findElement(By.id("email_create")).sendKeys("raghavrock786@gmail.com");
			 driver.findElement(By.id("SubmitCreate")).click(); 
		}
	}

}
