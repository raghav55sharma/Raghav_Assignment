package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogOut {
	
	WebDriver driver;
	
	@Given("^User is logged into application$")
	public void user_is_logged_into_application() throws Throwable {
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\jshrag3\\Desktop\\my data\\Professional\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jshrag3\\Desktop\\my data\\Professional\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		driver.findElement(By.id("email")).sendKeys("raghavrock786@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("wipro123");
		
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //throw new PendingException();
	}

	@When("^User click on LogOut button$")
	public void user_click_on_LogOut_button() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //throw new PendingException();
	}

	@Then("^User is logged out of application$")
	public void user_is_logged_out_of_application() throws Throwable {
		
System.out.println("Successfully Logged Out");
		
		driver.quit();
	    
	    //throw new PendingException();
	}
	
	

}
