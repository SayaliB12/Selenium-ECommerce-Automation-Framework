package com.DemoWebShop.generic_utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	public  WebDriver driver;
	public WebDriver_Uitility wdu;
	 public String browser;
	public String url;
	public String email ;
	public String password;
	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("---Executing Before Suite---");
	}
	@AfterSuite
	public void configAfterSuite() {
		System.out.println("---Executing After Suite---");
	}
	@BeforeTest
	public void configBeforeTest() {
		System.out.println("---Executing Before test---");
	}
	@AfterTest
	public void configAfterTest() {
		System.out.println("---Executing After Test---");
	}
	@BeforeClass
	public void configBeforeClass() throws FileNotFoundException, IOException {
		System.out.println("---Executing Before Class---");
		file_Utility fu=new file_Utility();
		 browser =fu.readkeyValueFromPropertyfile("browser");
		url = fu.readkeyValueFromPropertyfile("applicationUrl");
		email = fu.readkeyValueFromPropertyfile("validEmail");
		password =fu.readkeyValueFromPropertyfile("validPassword");	
	}
	@AfterClass
	public void configAfterClass()  {
		System.out.println("---Executing After Class---");	
	}
	//@Parameters("browser")
	@BeforeMethod
	public void configBeforeMethod() {
		System.out.println("---Executing Before Method---");
		//Launching the browser
		
		if (browser.contains("chrome")) {
		    driver = new ChromeDriver();
		} else if (browser.contains("edge")) {
		    driver = new EdgeDriver();
		} else if (browser.contains("firefox")) {
		    driver = new FirefoxDriver();
		} else {
		    throw new IllegalArgumentException("Enter a valid browser: " + browser);
		}
		//Maximize
		wdu = new WebDriver_Uitility(driver);
		wdu.maximizeBrowser();
		//Wait
		Wait_Utility wu=new Wait_Utility(driver);
		wu.waitForAllElements(10);
		//Navigating to app
		wdu.openApplication(url);
	}
	@AfterMethod
	public void configAfterMethod() {
		System.out.println("---Executing After Method---");
		//Quit browser
		wdu.terminateBrowser();
	}


}


