package com.ibm.FST_15_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://training-support.net/selenium/selects";
		driver.get(url);

		// Print webpage title
		System.out.println("Title of the page  : " + driver.getTitle());

		WebElement multiSelect = driver.findElement(By.xpath("//select[@id='multi-select']"));

		Select multiSelectOptions = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));

		System.out.println(multiSelectOptions.isMultiple());

		if (multiSelectOptions.isMultiple()) {

			multiSelectOptions.selectByVisibleText("Javascript");
			
			System.out.println("First Selected option " + multiSelectOptions.getFirstSelectedOption().getText());

			multiSelectOptions.selectByValue("node");

			for (int i = 4; i <= 6; i++) {
				multiSelectOptions.selectByIndex(i);
			}

			multiSelectOptions.deselectByValue("node");
			multiSelectOptions.deselectByIndex(7);
			
			List<WebElement> selectedMultipleOptions = multiSelectOptions.getAllSelectedOptions();
			
			for (WebElement option : selectedMultipleOptions ) {
				
				System.out.println("Selected optioins : "+option.getText());
			}
			
			multiSelectOptions.deselectAll();			
		}

		driver.close();

	}

}
