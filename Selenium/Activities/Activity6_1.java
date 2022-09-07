package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		// Open the browser
		String url = "https://training-support.net/selenium/dynamic-controls";

		driver.get(url);

		// //Print the title of the page
		System.out.println("Title of the page after landed for firt time  : " + driver.getTitle());

		WebElement checkBox = driver.findElement(By.xpath("//label[contains(text(),'Dynamic Checkbox')]"));
		WebElement btnRemove = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

		btnRemove.click();
		wait.until(ExpectedConditions.invisibilityOf(checkBox));

		btnRemove.click();
		wait.until(ExpectedConditions.visibilityOf(checkBox));
		checkBox.click();

		// Close the browser
		driver.close();

	}

}
