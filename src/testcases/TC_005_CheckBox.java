package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.TC_001_CommonFunctions;
import pageObjects.CheckBoxPageObjects;

public class TC_005_CheckBox extends TC_001_CommonFunctions {

	@Test
	public void checkBox() {

		// use pagefactory and init the elements
		PageFactory.initElements(driver, CheckBoxPageObjects.class);
	
		// click the CheckBox 
		CheckBoxPageObjects.CheckBox.click();

	}

}
