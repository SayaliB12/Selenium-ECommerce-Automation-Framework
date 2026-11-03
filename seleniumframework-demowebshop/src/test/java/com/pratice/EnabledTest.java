package com.pratice;

import org.testng.annotations.Test;

public class EnabledTest {
	@Test
	public void method1() {
		System.out.println("Executing Method 1");
		
	}
	@Test(dependsOnMethods ="method1")
	public void method2() {
		System.out.println("Executing Method 2");
		
	}

}


