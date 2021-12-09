package crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
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

	public void getCopyrightText() {
		WebElement footerElement1 = driver.findElement(By.xpath("//a[@id='admin_options']"));
		System.out.println("Copyright text in the footer  " + footerElement1.getText());

	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();
	}
}
