package com.pratice;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException     {
		// 1 Create object of file class class and handle fileInputStreamException
		File file=new File("C:\\Users\\Kalyani Kornule\\OneDrive\\Documents\\Sample.properties");
		//2 Create object of fileInputstream and handle IoException
		FileInputStream fis= new FileInputStream(file);
		//3 Create object of properties class
		Properties property=new Properties();
		//4 Call load() to load the FIS in the Properties object
		property.load(fis);
		//5 Read the values using key from the properties file
		String writtenbrowser = property.getProperty("browser");
		String url = property.getProperty("applicationUrl");
		System.out.println(writtenbrowser);
		System.out.println(url);
		

	}

}