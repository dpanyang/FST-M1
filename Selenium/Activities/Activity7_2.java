package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Open the browser
		String url = "https://training-support.net/selenium/dynamic-attributes";
		driver.get(url);

		// Perform testing and assertions

		wait.until(ExpectedConditions.titleContains("Dynamic"));
		System.out.println("Title of the page  : " + driver.getTitle());

		WebElement userName = driver.findElement(By.xpath("//input[contains(@class,\"-username\")]"));
		WebElement passWord = driver.findElement(By.xpath("//input[contains(@class,\"-password\")]"));
		WebElement confirmPassWord = driver
				.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@class,\"email-\")]"));
		WebElement signUp = driver.findElement(By.xpath("//button[@class=\"ui button\"][text()=\"Sign Up\"]"));

		userName.sendKeys("Test_user");
		passWord.sendKeys("password");
		confirmPassWord.sendKeys("password");
		email.sendKeys("testuser001@training-support.net");
		signUp.click();

		// Print login message

		WebElement loginMessage = driver.findElement(By.id("action-confirmation"));

		System.out.println("Login message ---------------->> : " + loginMessage.getText());

		// Close browser

		driver.close();

	}

}
