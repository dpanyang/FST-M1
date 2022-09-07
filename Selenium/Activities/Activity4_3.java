package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*	Activity 4-3

    Create a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open a browser with https://www.training-support.net/selenium/target-practice
    Get the title of the page using driver.getTitle() and print out the title.
    
    Use findElement() with xpath() to
        Find the third header on the page.
        Find the fifth header on the page and get it's 'colour' CSS Property.
        Find the violet button on the page and print all the class attribute values.
        Find the grey button on the page with Absolute XPath.*/

public class Activity4_3 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://www.training-support.net/selenium/target-practice";

		driver.get(url);

		// //Print the title of the page
		System.out.println("Title of the page after landed for firt time  : " + driver.getTitle());

		WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']"));
		WebElement fifthHeader = driver.findElement(By.xpath("//h5"));
		WebElement violetBtn = driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
		WebElement greyBtn = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[2]"));

		System.out.println("Third Header name on the page  : " + thirdHeader.getText());
		System.out.println("Color of fifth Header : " + fifthHeader.getCssValue("color"));

		System.out.println("Violet button - class attribute values : " + violetBtn.getAttribute("class"));

		System.out.println("Gray button label : " + greyBtn.getText());

		// Close the browser
		// driver.close();

	}

}
