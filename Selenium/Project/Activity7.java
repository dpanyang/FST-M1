package crm;

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

public class Activity7 {

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 11);
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
		logIn.click(); /// -----------------click on Login button -------------

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
	public void mouseHoverOnSalesandClickonLeads() {

		WebElement menuSales = driver
				.findElement(By.xpath("//a[@class=\"dropdown-toggle grouptab\"][text()=\"Sales\"]"));
		if (menuSales.isDisplayed())
			System.out.println("Menu Name  -----------\t\t\t : " + menuSales.getText());

		actions.moveToElement(menuSales).build().perform();

		WebElement menuSales_Leads = driver.findElement(By.linkText("Leads"));
		wait.until(ExpectedConditions.visibilityOf(menuSales_Leads));

		menuSales_Leads.click();

	}

	@Test(priority = 4)
	public void loadingLeadsPage() {

		wait.until(ExpectedConditions.titleContains("Leads » SuiteCRM"));

		WebElement leadsPageHeader = driver.findElement(By.xpath("//h2[contains(text(),'Leads')]"));

		System.out.println("Leads page header label ------\t\t\t : " + leadsPageHeader.getText());

		System.out.println("Page title after click on menu item Sales>Leads -----\t\t\t :  " + driver.getTitle());

		WebElement cell_AdditionInfo = driver.findElement(By.xpath("//table/tbody/tr[3]" + "/td[10]"));
		System.out.println(" Cell label for Additional Information  :" + cell_AdditionInfo.getText());

		cell_AdditionInfo.click(); // click on Additional Information cell

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));
		WebElement mobile = driver.findElement(By.xpath("//span[@class='phone']"));

		System.out.println("Mobile number on popup winodows is : " + mobile.getText());

		// WebElement closedAdditionInfo =
		// driver.findElement(By.xpath("//body/div[@id='bootstrap-container']/div[@id='content']/div[10]/div[1]/button[1]/span[1]"));

		// closedAdditionInfo.click();
	}

	@AfterClass
	public void afterClass() {
		// Close browser
		driver.close();
	}
}
