package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_ValidLogin {
	
	private static WebDriver driver;

	@Given("^User create a new account with valid email$")
	public void user_create_a_new_account_with_valid_email() throws Throwable {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\jshrag3\\Desktop\\my data\\Professional\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jshrag3\\Desktop\\my data\\Professional\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //throw new PendingException();
	}

	@When("^User Navigate to enter email text box$")
	public void user_Navigate_to_enter_email_text_box() throws Throwable {
driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("arun.pawar@gmail.com");

		
		
	    //throw new PendingException();
	}

	@When("^User clicks on create account button$")
	public void user_clicks_on_create_account_button() throws Throwable {
		driver.findElement(By.id("SubmitCreate")).click();
	    //throw new PendingException();
	}
		
		@When("^User fills in Account registration form$")
		public void user_fills_in_Account_registration_form() throws Throwable {
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
		    
		    //throw new PendingException();
		}

		@Then("^Account gets created successfully$")
		public void account_gets_created_successfully() throws Throwable {
			System.out.println("Account Created Successfully");
			
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
			
			System.out.println("Successfully Logged Out");
			
			driver.quit();
	//	    throw new PendingException();
		}
		

	
}
