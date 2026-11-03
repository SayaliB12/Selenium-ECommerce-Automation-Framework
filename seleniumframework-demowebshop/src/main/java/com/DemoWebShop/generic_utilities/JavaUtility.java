package com.DemoWebShop.generic_utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtility {
	
	
	 public String fecthtimeStamp() {
		 return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		
	}
	public int getRandomNumber() {
		return new Random().nextInt(100000);
		
	}

}
