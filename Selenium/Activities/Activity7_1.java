package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://training-support.net/selenium/dynamic-attributes";
		driver.get(url);

		// Perform testing and assertions
		System.out.println("Title of the page  : " + driver.getTitle());

		WebElement userName = driver.findElement(By.xpath("//input[contains(@class,'username')]"));

		WebElement passWord = driver.findElement(By.xpath("//input[contains(@class,'password')]"));
		WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));

		userName.sendKeys("admin");
		passWord.sendKeys("password");
		login.click();

		// Print login message

		WebElement loginMessage = driver.findElement(By.id("action-confirmation"));

		System.out.println("Login message ---------------->> : " + loginMessage.getText());

		// Close browser

		driver.close();

	}

}
