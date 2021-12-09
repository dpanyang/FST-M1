package crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
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
	public void headerImageURL() {

		WebElement headerImage = driver.findElement(By.xpath("//img[@alt=\"SuiteCRM\"]"));
		System.out.println("Header image source pateh : " + headerImage.getAttribute("src"));
	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();
	}
}
