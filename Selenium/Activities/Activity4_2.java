package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Activity 4-2

    Create a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open a browser with https://www.training-support.net/selenium/simple-form
    Get the title of the page using driver.getTitle() and print out the title.
    Use findElement() with xpath() to find all the input fields on the page.
    Fill in the details in the fields using the sendKeys() method.
    Click the submit button at the end of the form to submit the form.*/

public class Activity4_2 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://www.training-support.net/selenium/simple-form";
		driver.get(url);

		// //Print the title of the page
		System.out.println("Title of the page after landed for firt time  : " + driver.getTitle());

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement contactNumber = driver.findElement(By.xpath("//input[@id='number']"));
		WebElement txtMsg = driver.findElement(By.xpath("//textarea"));
		// WebElement submitForm =
		// driver.findElement(By.cssSelector("input.ui.green.button"));
		WebElement submitForm = driver.findElement(By.xpath("//input[contains(@class, 'green')]"));

		firstName.sendKeys("Debashish");
		lastName.sendKeys("P");
		email.sendKeys("debashishp@email.com");
		contactNumber.sendKeys("7107107109");
		txtMsg.sendKeys(" Test text message");
		submitForm.click();

		// Close the browser
		// driver.close();

	}

}
