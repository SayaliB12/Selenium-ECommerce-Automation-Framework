package com.pratice;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestNgAnnotationsPractice {
		
		//config Annotations
		@BeforeSuite
		void configBeforeSuit()
		{
			System.out.println("----Executing Before Suit----");
		}
		@AfterSuite
		void configAfterSuit()
		{
			System.out.println("----Executing After Suit----");
		}
		@BeforeTest
		void congigBeforeTest()
		{
			System.out.println("----Executing Before Test----");
		}
		@AfterTest
		void configAfterTest()
		{
			System.out.println("----Executing After Test----");
		}
		@BeforeClass
		void configBeforeClass()
		{
			System.out.println("----Executing Before Class----");
		}
		@AfterClass
		void configAfterClass()
		{
			System.out.println("----Executing After Class----");
		}
		@BeforeMethod
		void configBeforeMethod()
		{
			System.out.println("----Executing Before Method----");
		}
		@AfterMethod
		void configAfterMethod()
		{
			System.out.println("----Executing After Method----");
		}
		@Test
		void testMethod1()
		{
			System.out.println("----Executing Test Method1----");
		}
		@Test
		void testMethod2()
		{
			System.out.println("----Executing Test Method2----");
		}
		@Test
		void testMethod3()
		{
			System.out.println("----Executing Test Method3----");
		}
		
		

	}


