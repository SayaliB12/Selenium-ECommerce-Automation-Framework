package com.dws.object_repository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class WelcomePage {
		
		WebDriver driver;
		public WelcomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(linkText = "Log in")
		private WebElement logingLink;
		
		@FindBy(linkText = "Register")
		private WebElement registerLink;
		
		@FindBy(xpath="//div[@class='header-links']//a[@href='/customer/info']")
		private WebElement registeredEmailText;

		//Getters
		public WebElement getLogingLink() {
			return logingLink;
		}

		public WebElement getRegisterLink() {
			return registerLink;
		}
		public WebElement getRegisteredEmailText() {
			return registeredEmailText;
		}

		//Bussiness logic
		public void clickOnLogin() {
		logingLink.click();
		}
		public void clickOnRegister() {
			registerLink.click();
		}
		
		}


