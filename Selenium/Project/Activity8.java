package crm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		actions = new Actions(driver);

		// Open browser
		driver.get("http://alchemy.hguy.co/crm");
	}

	@Test(priority = 1)
	public void pageTitleTest() {

		String title = driver.getTitle();
		System.out.println("Web page title is -----------\t\t\t : " + title);
		Assert.assertEquals(title, "SuiteCRM", "Titles of the website do not match");

	}

	@Test(priority = 2)
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

		System.out.println("Home page left panel header -----------\t\t\t : " + leftPanelHeader.getText());

		String leftPanelHeaderText;
		wait.until(ExpectedConditions.visibilityOf(leftPanelHeader));
		leftPanelHeaderText = leftPanelHeader.getText();

		Assert.assertEquals(leftPanelHeaderText, "Recently Viewed", " Left Panle Header is visible");

		/*
		 * if (leftPanelHeaderText == "Recently Viewed")
		 * System.out.println("Homepage loaded successfully"); else
		 * System.out.println("Homepage loaded FAIL");
		 */
	}

	@Test(priority = 3)
	public void mouseHoverOnSales() {

		WebElement menuSales = driver
				.findElement(By.xpath("//a[@class=\"dropdown-toggle grouptab\"][text()=\"Sales\"]"));
		if (menuSales.isDisplayed())
			System.out.println("Menu Name  -----------\t\t\t : " + menuSales.getText());

		actions.moveToElement(menuSales).build().perform();

		WebElement menuSales_Accounts = driver.findElement(By.linkText("Accounts"));
		wait.until(ExpectedConditions.visibilityOf(menuSales_Accounts));

		menuSales_Accounts.click();

	}

	@Test(priority = 4)
	public void loadingAccountPage() {

		// WebElement topMenuAccount =
		// driver.findElement(By.xpath("//h2[contains(text(),'Accounts')]"));

		wait.until(ExpectedConditions.titleContains("Accounts"));

		WebElement accountPageHeader = driver.findElement(By.xpath("//h2[contains(text(),'Accounts')]"));

		System.out.println("Account page header label ------\t\t\t : " + accountPageHeader.getText());

		System.out.println("Page title after click on menu item Sales>Account -----\t\t\t :  " + driver.getTitle());

		// Use the th
		List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr[1]/th"));
		// Number of columns
		System.out.println(cols.size());

		// Use the td
		List<WebElement> cols1 = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		// Number of columns
		System.out.println(cols1.size());

		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		// Number of columns
		System.out.println(rows.size());

		System.out.println("Names of the first 5 odd-numbered rows  : ");

		for (int i = 1; i <= 9; i++) {
			WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]" + "/td[3]/b/a"));
			System.out.println("Row " + i + ": " + row.getText());
			i++;
		}

	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();
	}
}
