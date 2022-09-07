package com.ibm.FST_15_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://training-support.net/selenium/selects";
		driver.get(url);

		// Print webpage title
		System.out.println("Title of the page  : " + driver.getTitle());

		Select dropdownField = new Select(driver.findElement(By.xpath("//select[@id='single-select']")));

		//System.out.println(dropdownField.isMultiple());

		dropdownField.selectByVisibleText("Option 2"); // Select the second option
		dropdownField.selectByIndex(3); // Select the 3rd option
		dropdownField.selectByValue("4"); // Select the fourth option

		List<WebElement> dropdownOptions = dropdownField.getOptions();

		for (WebElement dropdownOption : dropdownOptions) {

			System.out.println("Option: " + dropdownOption.getText());

		}

		// Close browser

		driver.close();

	}

}
