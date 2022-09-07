package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Open the browser
		String url = "https://training-support.net/selenium/ajax";
		driver.get(url);

		// Perform testing and assertions
		System.out.println("Title of the page " + driver.getTitle());
		WebElement btnChangeContent = driver.findElement(By.xpath("//button[contains(text(),'Change Content')]"));
		// WebElement textHello =
		// driver.findElement(By.xpath("//h1[contains(text(),'HELLO!')]"));

		btnChangeContent.click();

		// Wait for text to load

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

		// getText() and print it

		String ajaxText = driver.findElement(By.id("ajax-content")).getText();

		System.out.println(ajaxText);

		// Wait for late text

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

		// Get late text and print it

		String lateText = driver.findElement(By.id("ajax-content")).getText();

		System.out.println(lateText);

	}

}
