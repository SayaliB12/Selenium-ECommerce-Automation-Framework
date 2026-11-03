package com.DemoWebShop.generic_utilities;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class WebDriver_Uitility {
	WebDriver driver;
	public WebDriver_Uitility(WebDriver driver) {
		this.driver=driver;
	}
	
	//navigate to application

public void openApplication(String appURL) {
    System.out.println("Application URL: " + appURL);

    if (driver == null) {
        throw new IllegalStateException("WebDriver is null!");
    }

    if (appURL == null || appURL.trim().isEmpty()) {
        throw new IllegalArgumentException("Application URL is null or empty!");
    }

    driver.get(appURL);
}

	
	//Fetch Title
	public String fetchTitle(){
		return driver.getTitle();
		}
	//Fetch Url
	public String fetchUrl() {
		return driver.getCurrentUrl();
	}
	//Get Window handle
	public String fetchwindowId() {
		return driver.getWindowHandle();
	}
	//GetWindowHandles
	public Set <String>fetchAllwindowIds() {
		return driver.getWindowHandles();
	}
	//Switch to child window
	public void switchControlToAllWindow(String title) {
		for (String handle :fetchAllwindowIds()) {
		    driver.switchTo().window(handle);
		    if (fetchTitle().contains(title)) {
				break;
			}
		}
	}
	
	//Open a new tab
	public void openNewTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	//Switch to Alert
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void typeAndAcceptAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	//Quit
	public void terminateBrowser() {
		driver.quit();
	}
	//Switch to frame
	public void switchToFrame(String nameorId) {
		driver.switchTo().frame(nameorId);
	}
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
//    public void waitForElementToLoad(WebDriver driver,long second) {
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
//    }
}