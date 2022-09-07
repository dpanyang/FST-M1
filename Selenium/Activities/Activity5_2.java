package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://training-support.net/selenium/dynamic-controls";

		driver.get(url);

		// //Print the title of the page
		System.out.println("Title of the page after landed for firt time  : " + driver.getTitle());

		WebElement checkBox = driver.findElement(By.xpath("//input[@class=('willDisappear')]"));

		System.out.println("Is checkbox is Selected in UI : " + checkBox.isSelected());

		checkBox.click();

		System.out.println("Is checkbox is Selected in UI : " + checkBox.isSelected());

		// Close the browser
		driver.close();

	}

}
