package com.pratice;

import org.testng.annotations.Test;

public class invocationCount {
	
	@Test( alwaysRun = true)
	
	public void  Register() throws InterruptedException {
		System.out.println("New user Registered");
		
	}
	@Test(priority=2,invocationCount=5)
	public void login() {
		System.out.println("New user Logged in");
	}

}
