package com.dws.object_repository;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-female")
	private WebElement femalerediobutton ;
	@FindBy(id="gender-male")
	private WebElement malerediobutton ;
	@FindBy(id="FirstName")
	private WebElement firstname;
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Email")
	private WebElement emailtextfield;
	@FindBy(id="Password")
	private WebElement passwordtextfield ;
	@FindBy(id="ConfirmPassword")
	private WebElement confrompasswordtextfield;
	@FindBy(id="register-button")
	private WebElement registerbutton;
	
	
	
	
	//Getter
	public WebElement getFemalerediobutton() {
		return femalerediobutton;
	}
	public WebElement getMalerediobutton() {
		return malerediobutton;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	public WebElement getconfrompassword() {
		return confrompasswordtextfield;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	//bussiness
	public void RegisterAsNewUser(String gender,String fristName,String lastName,String emailA,
			int randomNo,String emailB,String password, String confrompassword ) {
		if (gender.contains("Male")) {
			malerediobutton.click();
		}else {
			femalerediobutton.click();
		} 
		firstname.sendKeys(fristName);
		lastname.sendKeys(lastName);
		emailtextfield.sendKeys(emailA+randomNo+emailB);
		passwordtextfield.sendKeys(password);
		confrompasswordtextfield.sendKeys(confrompassword);
		registerbutton.click();
		
	}
	public WebElement getConfrompasswordtextfield() {
		return confrompasswordtextfield;
	}
	
	
    
}