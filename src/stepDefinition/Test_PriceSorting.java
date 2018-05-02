package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_PriceSorting {
	
	private static WebDriver driver;
	@Given("^User performs successful login$")
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
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//throw new PendingException();
	}
	
	@When("^User Navigates to summer dresses page$")
	public void user_Navigates_to_summer_dresses_page() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		 
		driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")).click();
	    //throw new PendingException();
	}

	@When("^User clicks on sort by price button$")
	public void user_clicks_on_sort_by_price_button() throws Throwable {
	    Select sort_price = new Select(driver.findElement(By.id("selectProductSort")));
	    sort_price.selectByVisibleText("Price: Lowest first");
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[2]"));
	    
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    //throw new PendingException();
	}

	@Then("^dress should be sorted in ascending order of price$")
	public void dress_should_be_sorted_in_ascending_order_of_price() throws Throwable {
	    System.out.println("Dress should be sorted in ascending order");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.quit();
	    //throw new PendingException();
	}


}
