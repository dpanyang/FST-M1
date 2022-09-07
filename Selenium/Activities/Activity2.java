package com.ibm.FST_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net");
        
        //Perform testing and assertions
        driver.getTitle();
        System.out.print(driver.getTitle());
        WebElement idLocator=driver.findElement(By.id("about-link"));
        
        
        //WebElement classNameLocator = driver.findElement(By.className("ui inverted huge green button"));
              
        
        WebElement linktextLocator = driver.findElement(By.linkText("About Us"));
        WebElement cssSelectorLocator = driver.findElement(By.cssSelector("a#about-link"));
        
        System.out.println("By ID Locator :" +idLocator.getText());
        //System.out.println(classNameLocator.getText());
        System.out.println("By linkText locator : "+ linktextLocator.getText());
        System.out.println("By cssSelector Locator : "+ cssSelectorLocator.getText());
       
        
        //Close the browser
       // driver.close();
        
        

	}

}
