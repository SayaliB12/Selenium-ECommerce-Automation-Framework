package com.DemoWebShop.generic_utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Utility {
	WebDriver driver;
	public Wait_Utility(WebDriver driver) {
		this .driver=driver;
	}
	
	//wait for Elements to load
	public void waitForAllElements(long secondTowait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondTowait));
	}
	//wait for page to load
	public void waitForWebPageLoad(long secondsWait) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(secondsWait));
	}
	//wait for Element to be clickable
	public void waitFoeElementToBeClickable(long secondsToWait,WebElement target) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
		wait.until(ExpectedConditions.elementToBeClickable(target));
		
	}
	//wait for element to visiable
	public void waitFoeElementToBeVisiable(long secondsToWait,WebElement target) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
		wait.until(ExpectedConditions.visibilityOf(target));
		
	}
}
