package com.pratice;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(priority = 1)
	public void cutting() {
		System.out.println("Cutting Vegetable");
	}
	@Test(priority = 2)
	public void cooking() {
		System.out.println("Cooking Food");
	}

}
