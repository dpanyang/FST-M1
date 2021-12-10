package ProjectActivity;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GooglekeepaActivity3 {
	
	AppiumDriver<MobileElement> driver = null;
	
@BeforeClass
	
	public void Setup() throws MalformedURLException {
		
	DesiredCapabilities caps = new DesiredCapabilities();

	caps.setCapability("deviceName", "Pixel4Emulator");
    caps.setCapability("platformName", "Android");
    caps.setCapability("appPackage", "com.google.android.keep");
    caps.setCapability("appActivity", ".activities.BrowseActivity");
    caps.setCapability("automationName", "UiAutomator2");
    caps.setCapability("noReset", true);
	
    URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
    driver = new AndroidDriver<MobileElement>(appServer, caps);
	}

@Test 

public void goglkp1() {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("new_note_button"))).click();
	MobileElement note = driver.findElementById("edit_note_text");

	note.sendKeys("google keep test description act2");
	MobileElement Title = driver.findElementById("editable_title");
	Title.click();
	Title.sendKeys("GKTitle2");
	MobileElement reminder = driver.findElementById("menu_switch_to_list_view");
	reminder.click();
	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Pick a date & time\")"))).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/time_spinner\")"))).click();
	//driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"time_spinner\")")).click();
	wait.until(ExpectedConditions.presenceOfElementLocated((MobileBy.AndroidUIAutomator("text(\"Afternoon\")")))).click();
	driver.findElement(MobileBy.id("save")).click();
	MobileElement back = driver.findElement(MobileBy.AccessibilityId("Open navigation drawer"));
    back.click();
	driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
	driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/index_note_text_description\")")).click();
	MobileElement assrttitle = driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/index_note_title\")"));
	Assert.assertEquals(assrttitle.getText(),"GKTitle2" );
	
	}

@AfterClass
public void afterClass() {
    driver.quit();

}
}
