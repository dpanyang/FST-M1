package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		driver.get("https://training-support.net/selenium/simple-form");

		// Perform testing and assertions
		System.out.println("Title of the page " + driver.getTitle());

		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement contactNumber = driver.findElement(By.id("number"));
		WebElement submitForm = driver.findElement(By.cssSelector("input.ui.green.button"));

		firstName.sendKeys("Debashish");
		lastName.sendKeys("P");
		email.sendKeys("debashishp@email.com");
		contactNumber.sendKeys("7107107109");
		submitForm.click();

		System.out.println(firstName.getText() + lastName.getText());

	}

}
