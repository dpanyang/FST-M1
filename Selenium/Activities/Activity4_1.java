package com.ibm.FST_15_Selenium;

/*Activity 4-1

    Create a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open a browser with https://www.training-support.net
    Get the title of the page using driver.getTitle() and print out the title.
    Use findElement() with xpath() to find and click the "About Us" link on the page.
    Print the title of the new page that open when the link is clicked.
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		String url = "https://www.training-support.net";
		driver.get(url);

		// //Print the title of the page
		System.out.println("Title of the page after landed for firt time  : " + driver.getTitle());

		WebElement aboutUs = driver.findElement(By.xpath("//a[@id='about-link']"));

		// System.out.println(aboutUs.getText());

		aboutUs.click();

		System.out.println("Title of the page after click on About Us link : " + driver.getTitle());
		
		
        //Close the browser		
        driver.close();

	}

}
