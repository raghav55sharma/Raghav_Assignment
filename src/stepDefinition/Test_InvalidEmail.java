package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_InvalidEmail {
	
	private static WebDriver driver;

	@Given("^User hits the valid url$")
	public void user_hits_the_valid_url() throws Throwable {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\jshrag3\\Desktop\\my data\\Professional\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jshrag3\\Desktop\\my data\\Professional\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	   // throw new PendingException();
	}
	
	@When("^User enter invalid email id$")
	public void user_enter_invalid_email_id() throws Throwable {
	    driver.findElement(By.id("email_create")).sendKeys("ayz.123");
	    
	    driver.findElement(By.name("SubmitCreate")).click();
	    //throw new PendingException();
	}

	@Then("^Message displayed as invalid email id$")
	public void message_displayed_as_invalid_email_id() throws Throwable {
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li"));
		System.out.println(element);
		
		//driver.findElement(By.xpath("//*[@id=\"create_account_error\" and contains(text(), '1. Invalid email address')]")).isDisplayed();
		String actual_msg = element.getText();
		
		//Thread.sleep(2000);
	    System.out.println("Error message "+actual_msg);
	    
	    if (actual_msg.contains("Invalid email address."))
	    {
	    	System.out.println("Test Passed. Enter Valid Email ID");
	    }
	    
	   driver.quit();
		
	    //throw new PendingException();
	 	}
	
}
