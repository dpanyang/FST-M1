package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	

	WebDriver driver;
	WebDriverWait wait;
	
	
	
	@Given("User is on Login page")
	public void user_is_on_login_page() throws Throwable {
		// Create a new instance of the Firefox driver
				driver = new FirefoxDriver();

				wait = new WebDriverWait(driver, Duration.ofSeconds(15));

				// Open the browser
				driver.get("https://www.training-support.net/selenium/login-form");

				
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() throws Throwable {
		
		wait.until(ExpectedConditions.titleContains("Login Form"));
		System.out.println("Web page Title : " +driver.getTitle());
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement btnLogIn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		
		userName.sendKeys("admin");
		passWord.sendKeys("password");
		btnLogIn.click();
			
		
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String username, String password) throws Throwable{
		
        //Enter username from Feature file
		
        driver.findElement(By.id("username")).sendKeys(username);
	
        //Enter password from Feature file
	
        driver.findElement(By.id("password")).sendKeys(password);
	
        //Click Login
	
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
	
	

	@Then("Read the page title and confirmation message")
	public void read_the_page_title_and_confirmation_message() throws Throwable {
	    
		System.out.println("Web page Title : " +driver.getTitle());
		System.out.println("Confirmation Message : " + (driver.findElement(By.xpath("//div[@id='action-confirmation']"))).getText());
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Close the Browser")
	public void close_the_browser() throws Throwable {
	    
		driver.close();
	    //throw new io.cucumber.java.PendingException();
	}


}
