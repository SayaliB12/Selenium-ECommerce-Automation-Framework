package com.pratice;

import org.testng.annotations.Test;

import com.DemoWebShop.generic_utilities.excel_utility;

public class Demo {
	
	@Test(dataProvider = "RegisterUser_excel_data",dataProviderClass =excel_utility.class )
	public void  RegisterAsNewUser(String a,String b,String c,String d,String e,String f) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	




	
	}

}
