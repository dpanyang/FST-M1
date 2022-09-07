package com.ibm.FST_15_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://training-support.net/selenium/tables";
		driver.get(url);

		// Print title of webpage
		System.out.println("Title of the page  : " + driver.getTitle());

		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));

		// Number of columns

		System.out.println("Number of columns are: " + cols.size());

		// Number of rows

		System.out.println("Number of rows are: " + rows.size());

		// Get third row values and print them

		List<WebElement> thirdRow = driver
				.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));

		for (WebElement cellValue : thirdRow) {

			System.out.println("Cell Value: " + cellValue.getText());

		}

		// Cell value of second row, second column

		WebElement cellValue_row2_col2 = driver
				.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));

		System.out.println("Second row, second column value: " + cellValue_row2_col2.getText());

		// Close browser

		driver.close();

	}

}
