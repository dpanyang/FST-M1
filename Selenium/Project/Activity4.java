package crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);

		// Open browser
		driver.get("http://alchemy.hguy.co/crm");
	}

	@Test(priority = 1)

	public void loginTest() {

		WebElement userName = driver.findElement(By.xpath("//input[@id='user_name']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='username_password']"));
		WebElement logIn = driver.findElement(By.xpath("//input[@id='bigbutton']"));

		if (userName.isEnabled())
			userName.sendKeys("admin");
		else
			System.out.println("userName disable");
		if (passWord.isEnabled())
			passWord.sendKeys("pa$$w0rd");
		else
			System.out.println("passWord disable");
		
		logIn.click();

		WebElement leftPanelHeader = driver.findElement(By.xpath("//h2[contains(text(),'Recently Viewed')]"));
		String leftPanelHeaderText;
		wait.until(ExpectedConditions.visibilityOf(leftPanelHeader));
		leftPanelHeaderText = leftPanelHeader.getText();

		Assert.assertEquals(leftPanelHeaderText, "Recently Viewed");

		if (leftPanelHeaderText == "Recently Viewed")
			System.out.println(" User is logged in with provided credential and Homepage loaded successfully");

	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();
	}
}
