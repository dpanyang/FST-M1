package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Activity 5-1

    Create a Package with a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
    Get the page title and print it to the console.
    Use findElement() to find the checkbox input element.
    Use the isDisplayed() method to check if it is visible on the page.
    Click the "Remove Checkbox".
    Print the result of the isDisplayed() method again.
*/

public class Activity5_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://training-support.net/selenium/dynamic-controls";

		driver.get(url);

		// //Print the title of the page
		System.out.println("Title of the page after landed for firt time  : " + driver.getTitle());

		WebElement checkBox = driver.findElement(By.xpath("//label[contains(text(),'Dynamic Checkbox')]"));
		WebElement btnRemove = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

		System.out.println("Is checkbox is displayed in UI : " + checkBox.isDisplayed());

		btnRemove.click();

		System.out.println("Is checkbox is displayed in UI : " + checkBox.isDisplayed());

		// Close the browser
		driver.close();

	}

}
