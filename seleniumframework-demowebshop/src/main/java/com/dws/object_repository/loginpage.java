package com.dws.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	public loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//locators
	@FindBy(id="Email")
	private WebElement emailTextFiled;
	
	@FindBy(id="password")
	private WebElement passwordTextFiled;
	
	@FindBy(css="[value='log in']")
	private WebElement logbutton;
	
	//getter
	public WebElement getEmailTextFiled() {
		return emailTextFiled;
	}

	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}

	public WebElement getLogbutton() {
		return logbutton;
	}
	
	//busniess logic 
	public void LoginAsValidUser(String VaildEmail,String ValidPassword) {
		emailTextFiled.sendKeys(VaildEmail);
		passwordTextFiled.sendKeys(ValidPassword);
		logbutton.click();
	}
	

}
