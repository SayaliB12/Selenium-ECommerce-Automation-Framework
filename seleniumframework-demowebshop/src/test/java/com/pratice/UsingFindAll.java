package com.pratice;



import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingFindAll {
	static String oHRMUsername="Admin";
	static String slUsername="standard_user";
	static String oHRMPassword="admin123";
	static String slPassword="secret_sauce";
	static String slUrl="https://www.saucedemo.com/";
	static String oHRMUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static WebDriver driver;
	UsingFindAll(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	   //username
	@FindAll({@FindBy(id="user-name"),@FindBy(name="username")})
	WebElement user;
	   //password
	@FindAll({@FindBy(id="password"),@FindBy(name="password")})
	WebElement password;
	   //Test Script
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(slUrl);
		UsingFindAll ufa=new UsingFindAll(driver);
		ufa.user.sendKeys(slUsername);
		ufa.password.sendKeys(slPassword,Keys.ENTER);
		driver.quit();
		driver.get(oHRMUrl);
		UsingFindAll ufa1=new UsingFindAll(driver);
		ufa1.user.sendKeys(oHRMUsername);
		ufa1.password.sendKeys(oHRMPassword,Keys.ENTER);
		driver.quit();
		

	}

}