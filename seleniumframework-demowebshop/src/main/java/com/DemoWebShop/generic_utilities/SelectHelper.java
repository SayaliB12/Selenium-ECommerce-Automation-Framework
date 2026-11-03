package com.DemoWebShop.generic_utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

public class SelectHelper {
	Select select;

	//Selection 
	public void selectAnoption(WebElement selectElement,String value) {
		select =new Select(selectElement);
		select.selectByValue(value);
	}
	public void selectAnOption(WebElement selectElement,int index) {
		select =new Select(selectElement);
		select.selectByIndex(index);
	}
	public void selectAnOption(String visiableText,WebElement selectElement) {
		select =new Select(selectElement);
		select.deselectByVisibleText(visiableText);
	}
	//deselection
	

}
