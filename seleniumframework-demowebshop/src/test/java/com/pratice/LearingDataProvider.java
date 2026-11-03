package com.pratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearingDataProvider {
	
	//creating DataProvider method
	@DataProvider(name = "loginCreds")
	
	public Object[][] getData(){
		Object[][] data =new
				Object[][] {{"User1","Password1"},
				            {"User2","Password2"},
			                 { "User3","Password3"}};
	

	return data;
}
	@Test(dataProvider = "loginCreds")
	public void testMethod(String Username, String Password) {
		System.out.println("The Username is :"+Username);
		System.out.println("The Password is :"+Password);
		System.out.println("----------------------------");
	}
}