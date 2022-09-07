package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://training-support.net/selenium/dynamic-controls";

		driver.get(url);

		// //Print the title of the page
		System.out.println("Title of the page after landed for firt time  : " + driver.getTitle());

		WebElement textBox = driver.findElement(By.xpath("//input[@id='input-text']"));
		WebElement btnEnableInput = driver.findElement(By.xpath("//button[@id='toggleInput']"));

		System.out.println("Is text box  is enable in UI : " + textBox.isEnabled());

		btnEnableInput.click();

		System.out.println("Is text box is enable in UI : " + textBox.isEnabled());

		// Close the browser
		driver.close();

	}

}
