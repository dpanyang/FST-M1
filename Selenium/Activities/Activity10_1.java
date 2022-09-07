package com.ibm.FST_15_Selenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Open the browser
		String url = "https://www.training-support.net/selenium/input-events";
		driver.get(url);

		// Perform testing and assertions
		System.out.println("Title of the page : " + driver.getTitle());

		WebElement cubeArea = driver.findElement(By.xpath("//div[@id='wrapD3Cube']"));

		cubeArea.click();
		WebElement cubeValue = driver.findElement(By.className("active"));

		System.out.println("Cube side value after mouse left SINGLE click : " + cubeArea.getText());

		System.out.println(
				"\n==================================================================================================\n");

		actions.doubleClick(cubeArea).perform();
		cubeValue = driver.findElement(By.className("active"));
		System.out.println("Cube side value after mouse left DUBLE click : " + cubeValue.getText());

		actions.moveToElement(cubeValue).build().perform();
		actions.contextClick(cubeArea).perform();
		cubeValue = driver.findElement(By.className("active"));
		System.out.println("Cube side value after mouse RIGHT click : " + cubeValue.getText());

		// Need to check script again -------------------
	}

}
